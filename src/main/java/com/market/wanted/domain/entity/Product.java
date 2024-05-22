package com.market.wanted.domain.entity;

import com.market.wanted.domain.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Product extends BaseEntity {

    @Id
    @Column(columnDefinition = "unsigned")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Comment("상품명")
    @Column(nullable = false)
    private String name;

    @Comment("상품 가격")
    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    @Comment("판매자")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "seller_id", nullable = false, foreignKey = @ForeignKey(name = "fk_product_seller"))
    private User seller;

    @Comment("구매자")
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id", foreignKey = @ForeignKey(name = "fk_product_buyer"))
    private User buyer;

    @Comment("거래일시")
    private LocalDateTime tradedAt;

}
