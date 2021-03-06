package graphql.kickstart.servlet.context;

import graphql.kickstart.execution.context.GraphQLContext;
import javax.websocket.Session;
import javax.websocket.server.HandshakeRequest;
import java.util.Optional;

public interface GraphQLWebSocketContext extends GraphQLContext {

    Session getSession();

    HandshakeRequest getHandshakeRequest();

}
