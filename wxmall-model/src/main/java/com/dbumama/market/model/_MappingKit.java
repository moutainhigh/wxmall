package com.dbumama.market.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("t_agent", "id", Agent.class);
		arp.addMapping("t_agent_aduit_log", "id", AgentAduitLog.class);
		arp.addMapping("t_agent_cash_rcd", "id", AgentCashRcd.class);
		arp.addMapping("t_agent_comm_rcd", "id", AgentCommRcd.class);
		arp.addMapping("t_agent_commssion", "id", AgentCommssion.class);
		arp.addMapping("t_agent_rank", "id", AgentRank.class);
		arp.addMapping("t_area", "id", Area.class);
		arp.addMapping("t_auth_user_config", "id", AuthUserConfig.class);
		arp.addMapping("t_buyer_card", "id", BuyerCard.class);
		arp.addMapping("t_buyer_prod", "id", BuyerProd.class);
		arp.addMapping("t_buyer_receiver", "id", BuyerReceiver.class);
		arp.addMapping("t_buyer_recharge", "id", BuyerRecharge.class);
		arp.addMapping("t_buyer_user", "id", BuyerUser.class);
		arp.addMapping("t_card", "id", Card.class);
		arp.addMapping("t_cart", "id", Cart.class);
		arp.addMapping("t_cashback", "id", Cashback.class);
		arp.addMapping("t_cashback_product", "id", CashbackProduct.class);
		arp.addMapping("t_cashback_rcd", "id", CashbackRcd.class);
		arp.addMapping("t_commission_rate", "id", CommissionRate.class);
		arp.addMapping("t_delivery_set", "id", DeliverySet.class);
		arp.addMapping("t_delivery_template", "id", DeliveryTemplate.class);
		arp.addMapping("t_express_comp", "id", ExpressComp.class);
		arp.addMapping("t_express_img", "id", ExpressImg.class);
		arp.addMapping("t_express_template", "id", ExpressTemplate.class);
		arp.addMapping("t_full_cut", "id", FullCut.class);
		arp.addMapping("t_full_cut_product", "id", FullCutProduct.class);
		arp.addMapping("t_full_cut_set", "id", FullCutSet.class);
		arp.addMapping("t_image_group", "id", ImageGroup.class);
		arp.addMapping("t_invoice_template", "id", InvoiceTemplate.class);
		arp.addMapping("t_lottery", "id", Lottery.class);
		arp.addMapping("t_lottery_award", "id", LotteryAward.class);
		arp.addMapping("t_lottery_record", "id", LotteryRecord.class);
		arp.addMapping("t_lottery_trade", "id", LotteryTrade.class);
		arp.addMapping("t_member_rank", "id", MemberRank.class);
		arp.addMapping("t_module", "id", Module.class);
		arp.addMapping("t_module_fun", "id", ModuleFun.class);
		arp.addMapping("t_multi_group", "id", MultiGroup.class);
		arp.addMapping("t_multi_group_set", "id", MultiGroupSet.class);
		arp.addMapping("t_order", "id", Order.class);
		arp.addMapping("t_order_gheader", "id", OrderGheader.class);
		arp.addMapping("t_order_guser", "id", OrderGuser.class);
		arp.addMapping("t_order_item", "id", OrderItem.class);
		arp.addMapping("t_order_log", "id", OrderLog.class);
		arp.addMapping("t_order_press_rcd", "id", OrderPressRcd.class);
		arp.addMapping("t_prize", "id", Prize.class);
		arp.addMapping("t_prize_send_record", "id", PrizeSendRecord.class);
		arp.addMapping("t_prize_type", "id", PrizeType.class);
		arp.addMapping("t_product", "id", Product.class);
		arp.addMapping("t_product_brand", "id", ProductBrand.class);
		arp.addMapping("t_product_category", "id", ProductCategory.class);
		arp.addMapping("t_product_group", "id", ProductGroup.class);
		arp.addMapping("t_product_group_set", "id", ProductGroupSet.class);
		arp.addMapping("t_product_image", "id", ProductImage.class);
		arp.addMapping("t_product_review", "id", ProductReview.class);
		arp.addMapping("t_product_spec_item", "id", ProductSpecItem.class);
		arp.addMapping("t_product_specification", "id", ProductSpecification.class);
		arp.addMapping("t_product_specification_value", "id", ProductSpecificationValue.class);
		arp.addMapping("t_promotion", "id", Promotion.class);
		arp.addMapping("t_promotion_set", "id", PromotionSet.class);
		arp.addMapping("t_purchase", "id", Purchase.class);
		arp.addMapping("t_purchase_order", "id", PurchaseOrder.class);
		arp.addMapping("t_qiandao", "id", Qiandao.class);
		arp.addMapping("t_qiandao_config", "id", QiandaoConfig.class);
		arp.addMapping("t_qiandao_record", "id", QiandaoRecord.class);
		arp.addMapping("t_qiandao_user", "id", QiandaoUser.class);
		arp.addMapping("t_refund", "id", Refund.class);
		arp.addMapping("t_role", "id", Role.class);
		arp.addMapping("t_seller_addr", "id", SellerAddr.class);
		arp.addMapping("t_seller_images", "id", SellerImages.class);
		arp.addMapping("t_seller_user", "id", SellerUser.class);
		arp.addMapping("t_shipping", "id", Shipping.class);
		arp.addMapping("t_shop", "id", Shop.class);
		arp.addMapping("t_specification", "id", Specification.class);
		arp.addMapping("t_specification_value", "id", SpecificationValue.class);
		arp.addMapping("t_user_code", "id", UserCode.class);
		arp.addMapping("t_weapp", "id", Weapp.class);
		arp.addMapping("t_weapp_audit", "id", WeappAudit.class);
		arp.addMapping("t_wei_page", "id", WeiPage.class);
		arp.addMapping("t_weipage_category", "id", WeipageCategory.class);
	}
}

