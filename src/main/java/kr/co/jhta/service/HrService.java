package kr.co.jhta.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jhta.mapper.ProductMapper;
import kr.co.jhta.vo.Product;

@Service
public class HrService {
	@Autowired
	private ProductMapper productMapper;
	
	// 신규 상품정보 추가
	public void insertProduct(Product product) {
		productMapper.insertProduct(product);
	}
	// 모든 상품 정보 조회
	public List<Product> getAllProducts() {
		return productMapper.getAllProducts();
	}
	// 상품번호에 해당하는 상품정보 하나 조회
	public Product getProductByProductNo(int productNo) {
		return productMapper.getProductByProductNo(productNo);
	}
	// 상품번호에 해당하는 상품정보 삭제
	public void deleteProductByProductNo(int productNo) {
		productMapper.deleteProductByProductNo(productNo);
	}
	// 변경된 상품정보를 전달받아서 상품정보 변경
	public void updateProduct(Product product) {
		productMapper.updateProduct(product);
	}
	// 상품이름, 제조회사, 최소가격/최대가격, 카테고리 번호를 전달받아서 상품정보를 검색
	public List<Product> searchProducts(Map<String, Object> param) {
		return productMapper.searchProducts(param);
	}
}
