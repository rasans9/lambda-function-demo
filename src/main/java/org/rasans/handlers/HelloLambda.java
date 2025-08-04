package org.rasans.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.rasans.dto.Request;
import org.rasans.dto.Response;

public class HelloLambda implements RequestHandler<Request, Response> {

    @Override
    public Response handleRequest(Request request, Context context) {
        context.getLogger().log("Received input: " + request);
        double avgMarks = request.getMarks().stream().mapToInt(Integer::intValue).sum() / (double) request.getMarks().size();
        return new Response(request.getId(),request.getName(),avgMarks,avgMarks*100);
    }
}
