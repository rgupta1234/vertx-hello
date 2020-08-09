package com.redhat.training.flozano.service;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.prometheus.client.Counter;

public class HelloServiceImpl implements HelloService {
static final Counter requests = Counter.build()
     .name("requests_total").help("Total requests.").register();
	@Override
	public void hello(String host, String name, Handler<AsyncResult<String>> resultHandler) {
		String msg = "RAVI GUPTA Hello " + name +  ", from '" + host + "'.\n";
		resultHandler.handle(Future.succeededFuture(msg));
	}
}
