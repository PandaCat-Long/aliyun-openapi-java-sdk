/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.datav_outer.model.v20190402;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetScreenConfigRequest extends RpcAcsRequest<GetScreenConfigResponse> {
	   

	private Integer screenId;

	private String product;

	private String domain;

	private String version;
	public GetScreenConfigRequest() {
		super("datav-outer", "2019-04-02", "GetScreenConfig", "datav");
		setMethod(MethodType.POST);
	}

	public Integer getScreenId() {
		return this.screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
		if(screenId != null){
			putBodyParameter("ScreenId", screenId.toString());
		}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putBodyParameter("Product", product);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putBodyParameter("Domain", domain);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putBodyParameter("Version", version);
		}
	}

	@Override
	public Class<GetScreenConfigResponse> getResponseClass() {
		return GetScreenConfigResponse.class;
	}

}
