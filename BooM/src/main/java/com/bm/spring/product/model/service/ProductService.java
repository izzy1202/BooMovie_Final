package com.bm.spring.product.model.service;

import java.util.ArrayList;
import com.bm.spring.product.model.vo.Cart;
import com.bm.spring.product.model.vo.Order;
import com.bm.spring.product.model.vo.Product;

public interface ProductService {

	// 장바구니 목록
	ArrayList<Cart> cartGetList();

	// 상품 주문
	int orderInsert();

	// 주문 취소
	int orderDelete();

	// 구매 목록
	ArrayList<Order> orderGetList();

	// 상품 목록
	ArrayList<Product> productGet();

	// 상품 상세
	int productDetail();

}
