/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import javax.annotation.Nullable;

// typedef: security.get_role_mapping.Request
public final class GetRoleMappingRequest extends RequestBase {
	@Nullable
	private final String name;

	// ---------------------------------------------------------------------------------------------

	protected GetRoleMappingRequest(Builder builder) {

		this.name = builder.name;

	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRoleMappingRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetRoleMappingRequest> {
		@Nullable
		private String name;

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link GetRoleMappingRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRoleMappingRequest build() {

			return new GetRoleMappingRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_role_mapping}".
	 */
	public static final Endpoint<GetRoleMappingRequest, GetRoleMappingResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= name;

				if (propsSet == (0 | 0 | name))
					return "GET";
				if (propsSet == (0 | 0))
					return "GET";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= name;

				if (propsSet == (0 | 0 | name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role_mapping");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				if (propsSet == (0 | 0)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role_mapping");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, GetRoleMappingResponse.JSONP_PARSER);
}
