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
package com.dbumama.market.web.core.listener;

import com.dbumama.market.message.Message;
import com.dbumama.market.message.MessageListener;
import com.dbumama.market.message.annotation.Listener;
import com.dbumama.market.model.AuthUserConfig;
import com.dbumama.market.model.Weapp;

/**
 * @author yangzy
 * 2017年7月23日
 */
@Listener(action = {"auth_user_config"})
public class AuthUserConfigListener extends AbstractConfig implements MessageListener{

	private Weapp weappDao = new Weapp().dao();
	
	/* (non-Javadoc)
	 * @see com.dbumama.market.message.MessageListener#onMessage(com.dbumama.market.message.Message)
	 */
	@Override
	public void onMessage(Message message) {
		AuthUserConfig authConfig = message.getData();
		saveWxsdkProp(authConfig, weappDao.findFirst("select * from " + Weapp.table));
	}

}
