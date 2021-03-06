package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseOrderPressRcd<M extends BaseOrderPressRcd<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public M setOrderId(java.lang.Long orderId) {
		set("order_id", orderId);
		return (M)this;
	}

	public java.lang.Long getOrderId() {
		return get("order_id");
	}

	public M setGheaderId(java.lang.Long gheaderId) {
		set("gheader_id", gheaderId);
		return (M)this;
	}

	public java.lang.Long getGheaderId() {
		return get("gheader_id");
	}

	public M setBuyerId(java.lang.Long buyerId) {
		set("buyer_id", buyerId);
		return (M)this;
	}

	public java.lang.Long getBuyerId() {
		return get("buyer_id");
	}

	public M setActive(java.lang.Boolean active) {
		set("active", active);
		return (M)this;
	}

	public java.lang.Boolean getActive() {
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
