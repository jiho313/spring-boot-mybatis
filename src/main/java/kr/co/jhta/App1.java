package kr.co.jhta;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import kr.co.jhta.service.HrService;
import kr.co.jhta.vo.Product;

public class App1 {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootMybatisApplication.class, args);
		
		HrService hrService = context.getBean(HrService.class);
		
		// 신규 상품정보 추가
//		Product product = new Product();
//		product.setName("아수스 게이밍 노트북");
//		product.setMaker("아수스");
//		product.setDescription("정말 좋은 아수스 노트북입니다.");
//		product.setPrice(1800000);
//		product.setDiscountPrice(16500000);
//		product.setStock(5);
//		product.setCatNo(103);
		
//		hrService.insertProduct(product);
		
		// 모든 상품 정보 조회
//		List<Product> products = hrService.getAllProducts();
//		for (Product product : products) {
//			System.out.println("상품번호 : " + product.getNo());
//			System.out.println("상품이름 : " + product.getName());
//			System.out.println("상품제조사 : " + product.getMaker());
//			System.out.println("상품가격 : " + product.getPrice());
//			System.out.println("상품할인가격 : " + product.getDiscountPrice());
//			System.out.println("상품판매여부 : " + product.getOnSell());
//			System.out.println("---------------------------------------------------------");
//		}
		
		// 상품번호에 해당하는 상품정보 하나 조회
//		Product product = hrService.getProductByProductNo(1112);
//		System.out.println("상품번호 : " + product.getNo());
//		System.out.println("상품이름 : " + product.getName());
//		System.out.println("상품제조사 : " + product.getMaker());
//		System.out.println("상품설명 : " + product.getDescription());
//		System.out.println("상품가격 : " + product.getPrice());
//		System.out.println("상품할인가격 : " + product.getDiscountPrice());
//		System.out.println("상품판매여부 : " + product.getOnSell());
//		System.out.println("상품재고 : " + product.getStock());
//		System.out.println("상품등록날짜 : " + product.getUpdateDate());
//		System.out.println("상품수정날짜 : " + product.getCreateDate());
//		System.out.println("상품카테고리번호 : " + product.getCatNo());
//		System.out.println("상품카테고리이름 : " + product.getCatName());
//		System.out.println("---------------------------------------------------------");
		
		// 상품번호에 해당하는 상품정보 삭제
//		hrService.deleteProductByProductNo(1110);
		
		// 변경된 상품정보를 전달받아서 상품정보 변경
//		Product product = hrService.getProductByProductNo(1111);
//		product.setOnSell("Y");
//		product.setName("아수스 게이밍 노트북");
//		
//		hrService.updateProduct(product);
		
		// 상품이름, 제조회사, 최소가격/최대가격, 카테고리 번호를 전달받아서 상품정보를 검색
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("maker", "아수스");
		param.put("catNo", "103");
		param.put("min", 1400000);
		param.put("max", 1800000);
		param.put("name", "게이밍");
		List<Product> products = hrService.searchProducts(param);
		for (Product product : products) {
			System.out.println("상품번호 : " + product.getNo());
			System.out.println("상품이름 : " + product.getName());
			System.out.println("상품제조사 : " + product.getMaker());
			System.out.println("상품가격 : " + product.getPrice());
			System.out.println("상품할인가격 : " + product.getDiscountPrice());
			System.out.println("상품판매여부 : " + product.getOnSell());
			System.out.println("---------------------------------------------------------");
		}
	}

}
