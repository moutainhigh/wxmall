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
package com.dbumama.market.web.core.ueditor.define;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangzy
 * 2017年7月10日
 */
public class FileType {
	
	public static final String JPG = "JPG";

	private static final Map<String, String> types = new HashMap<String, String>() {
		private static final long serialVersionUID = -935543810424292061L;
		{ put(FileType.JPG, ".jpg");}
	};

	public static String getSuffix(String key) {
		return FileType.types.get(key);
	}

	/**
	 * 根据给定的文件名,获取其后缀信息
	 * 
	 * @param filename 文件名
	 * @return String 文件扩展名
	 */
	public static String getSuffixByFilename(String filename) {
		return filename.substring(filename.lastIndexOf(".")).toLowerCase();
	}
	
}

