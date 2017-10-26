package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseLotteryTrade<M extends BaseLotteryTrade<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public M setLotteryId(java.lang.Long lotteryId) {
		set("lottery_id", lotteryId);
		return (M)this;
	}

	public java.lang.Long getLotteryId() {
		return get("lottery_id");
	}

	public M setTradeType(java.lang.Integer tradeType) {
		set("trade_type", tradeType);
		return (M)this;
	}

	public java.lang.Integer getTradeType() {
		return get("trade_type");
	}

	public M setConditionDay(java.lang.Integer conditionDay) {
		set("condition_day", conditionDay);
		return (M)this;
	}

	public java.lang.Integer getConditionDay() {
		return get("condition_day");
	}

	public M setConditionTradeStartdate(java.util.Date conditionTradeStartdate) {
		set("condition_trade_startdate", conditionTradeStartdate);
		return (M)this;
	}

	public java.util.Date getConditionTradeStartdate() {
		return get("condition_trade_startdate");
	}

	public M setConditionTradeEnddate(java.util.Date conditionTradeEnddate) {
		set("condition_trade_enddate", conditionTradeEnddate);
		return (M)this;
	}

	public java.util.Date getConditionTradeEnddate() {
		return get("condition_trade_enddate");
	}

	public M setTradeStatus(java.lang.Integer tradeStatus) {
		set("trade_status", tradeStatus);
		return (M)this;
	}

	public java.lang.Integer getTradeStatus() {
		return get("trade_status");
	}

	public M setTradeMoney(java.lang.Integer tradeMoney) {
		set("trade_money", tradeMoney);
		return (M)this;
	}

	public java.lang.Integer getTradeMoney() {
		return get("trade_money");
	}

	public M setActive(java.lang.Integer active) {
		set("active", active);
		return (M)this;
	}

	public java.lang.Integer getActive() {
		return get("active");
	}

	public M setCreated(java.util.Date created) {
		set("created", created);
		return (M)this;
	}

	public java.util.Date getCreated() {
		return get("created");
	}

	public M setUpdated(java.util.Date updated) {
		set("updated", updated);
		return (M)this;
	}

	public java.util.Date getUpdated() {
		return get("updated");
	}

}
