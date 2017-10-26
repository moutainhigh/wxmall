/**
 * Copyright (c) 成都次时代信息科技有限公司 2016-2017, 33732992@qq.com.
 *
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.gnu.org/licenses/lgpl-3.0.txt
 *	    http://www.ybwqy.com
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dbumama.market.web.core.freemarker.tag;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * @author yangzy
 * 2017年7月20日
 */
public class WxmShiroTag extends WxmTag{

	protected Subject getSubject() {
	    return SecurityUtils.getSubject();
	}
	
	/* (non-Javadoc)
	 * @see com.dbumama.market.web.core.freemarker.tag.WxmTag#onRender()
	 */
	@Override
	public void onRender() {
		
	}

}
