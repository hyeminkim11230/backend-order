package antigravity.model.response;

import antigravity.domain.entity.Product;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderDetailResponse {

    //상품정보(상품명, 상품컬러, 상품사이즈, 상품 금액), 주문갯수, 실제 결제 금액, 할인금액이 필요합니다.
    private int userId;
    private String productName;
    private String productColor;
    private String productSize;
    private int productPrice;
    private int count;
    private int totalPrice;
    private int discount;

}
