package example.grpc.server;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import ttt.TTT;

//public class GameServiceImpl extends GameServiceGrpc.GameImplBase {
public class TTTServiceImpl extends TTTGrpc.TTTImplBase {
	private TTT ttt = new TTT();
	
	@Override
	public void play(Game.PlayRequest request, StreamObserver<Game.PlayRequest> responseObserver) {

		// HelloRequest has auto-generated toString method that shows its contents
		System.out.println(request);

		// You must use a builder to construct a new Protobuffer object
		Game.PlayResponse response = Game.PlayResponse.newBuilder()
				.setPlay(request.getName()).build();

		// Use responseObserver to send a single response back
		responseObserver.onNext(response);

		// When you are done, you must call onCompleted
		responseObserver.onCompleted();
	}
		
	@Override
	public void check(CheckWinnerRequest request, StreamObserver<CheckWinnerResponse> responseObserver) {
		CheckWinnerResponse response = CheckWinnerResponse.newBuilder().setBoard(ttt.check()).build();
		
		responseObserver.onNext(response);
		
		responseObserver.onCompleted();
	}
	

	@Override
	public void board(CurrentBoardRequest request, StreamObserver<CurrentBoardResponse> responseObserver) {
		CurrentBoardResponse response = CurrentBoardResponse.newBuilder().setBoard(ttt.board()).build();
		
		responseObserver.onNext(response);
		
		responseObserver.onCompleted();
	}
	
}