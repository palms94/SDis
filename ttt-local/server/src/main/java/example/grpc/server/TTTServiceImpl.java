package example.grpc;

import example.grpc.Game;
import example.grpc.TTTServiceGrpc;
import example.grpc.TTTServiceImplBase;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import example.grpc.TTT;
import io.grpc.stub.StreamObserver;


//public class GameServiceImpl extends GameServiceGrpc.GameImplBase {
public class TTTServiceImpl extends TTTServiceGrpc.TTTServiceImplBase {
	private TTT ttt = new TTT();
	
	@Override
	

		public void currentBoard(CurrentBoardRequest request, StreamObserver<CurrentBoardResponse> responseObserver) {
			CurrentBoardResponse response = CurrentBoardResponse.newBuilder().setBoard(ttt.currentBoard()).build();
			responseObserver.onNext(response);
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
