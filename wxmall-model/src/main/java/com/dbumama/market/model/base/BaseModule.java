package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseModule<M extends BaseModule<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public M setModuleName(java.lang.String moduleName) {
		set("module_name", moduleName);
		return (M)this;
	}

	public java.lang.String getModuleName() {
		return get("module_name");
	}

	public M setClassName(java.lang.String className) {
		set("class_name", className);
		return (M)this;
	}

	public java.lang.String getClassName() {
		return get("class_name");
	}

	public M setTableName(java.lang.String tableName) {
		set("table_name", tableName);
		return (M)this;
	}

	public java.lang.String getTableName() {
		return get("table_name");
	}

	public M setParamName(java.lang.String paramName) {
		set("param_name", paramName);
		return (M)this;
	}

	public java.lang.String getParamName() {
		return get("param_name");
	}

	public M setModuleUrl(java.lang.String moduleUrl) {
		set("module_url", moduleUrl);
		return (M)this;
	}

	public java.lang.String getModuleUrl() {
		return get("module_url");
	}

	public M setModuleCode(java.lang.String moduleCode) {
		set("module_code", moduleCode);
		return (M)this;
	}

	public java.lang.String getModuleCode() {
		return get("module_code");
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
