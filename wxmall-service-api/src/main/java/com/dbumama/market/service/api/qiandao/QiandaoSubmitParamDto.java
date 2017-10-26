package com.dbumama.market.service.api.qiandao;

/**
 * 33732992@qq.com
 * 2016年7月20日
 */
@SuppressWarnings("serial")
public class QiandaoSubmitParamDto extends QiandaoParamDto{

	public QiandaoSubmitParamDto(Long sellerId, int pageNo) {
		super(sellerId, pageNo);
	}

	private Long qiandaoId;
	
	public Long getQiandaoId() {
		return qiandaoId;
	}

	public void setQiandaoId(Long qiandaoId) {
		this.qiandaoId = qiandaoId;
	}
	
}
