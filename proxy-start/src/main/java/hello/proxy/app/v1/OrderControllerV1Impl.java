package hello.proxy.app.v1;

public class OrderControllerV1Impl implements OrderControllerV1 {
    private final OrderSerivceV1 orderSerivce;
    public OrderControllerV1Impl(OrderSerivceV1 orderSerivce) {
        this.orderSerivce = orderSerivce;
    }
    @Override
    public String request(String itemId) {
        orderSerivce.orderItem(itemId);
        return "ok";
    }

    @Override
    public String noLog() {
        return "ok";
    }
}
