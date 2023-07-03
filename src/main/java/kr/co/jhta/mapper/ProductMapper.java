package kr.co.jhta.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.jhta.vo.Product;

@Mapper
public interface ProductMapper {
	
	// 신규 상품정보 추가
	void insertProduct(Product product);
	
	// 모든 상품 정보 조회
	List<Product> getAllProducts();
	
	// 상품번호에 해당하는 상품정보 하나 조회
	Product getProductByProductNo(int productNo);
	
	// 상품번호에 해당하는 상품정보 삭제
	void deleteProductByProductNo(int productNo);
	
	//  변경된 상품정보를 전달받아서 상품정보 변경
	void updateProduct(Product product);
	
	// 상품이름, 제조회사, 최소가격/최대가격, 카테고리 번호를 전달받아서 상품정보를 검색
	// (검색 조건은 위에 나열된 것 중에서 하나도 사용되지 않을 수도, 전부 사용될 수도 있다.)
	List<Product> searchProducts(Map<String, Object> param);
	
}
