package example.grpc.server;

import example.grpc.Game;
import example.grpc.TTTServiceGrpc;
import io.grpc.stub.StreamObserver;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GameServiceImpl extends TTTServiceGrpc.TTTServiceImplBase {

	@Override
	public void greeting(Game.PlayRequest request, StreamObserver<Game.PlayResponse> responseObserver) {

		// PlayRequest has auto-generated toString method that shows its contents
		System.out.println(request);

		// You must use a builder to construct a new Protobuffer object
		Game.PlayResponse response = Game.PlayResponse.newBuilder();
				.setGreeting("Play, " + request/*.getName() COMENTADO*/).build();

		// Use responseObserver to send a single response back
		responseObserver.onNext(response);

		// When you are done, you must call onCompleted
		responseObserver.onCompleted();
	}

}
