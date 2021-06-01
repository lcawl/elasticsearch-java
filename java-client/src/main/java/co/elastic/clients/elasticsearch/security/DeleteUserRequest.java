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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.delete_user.Request
public final class DeleteUserRequest extends RequestBase {
	private final String username;

	@Nullable
	private final JsonValue refresh;

	// ---------------------------------------------------------------------------------------------

	protected DeleteUserRequest(Builder builder) {

		this.username = Objects.requireNonNull(builder.username, "username");
		this.refresh = builder.refresh;

	}

	/**
	 * API name: {@code username}
	 */
	public String username() {
		return this.username;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue refresh() {
		return this.refresh;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteUserRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteUserRequest> {
		private String username;

		@Nullable
		private JsonValue refresh;

		/**
		 * API name: {@code username}
		 */
		public Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteUserRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteUserRequest build() {

			return new DeleteUserRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.delete_user}".
	 */
	public static final Endpoint<DeleteUserRequest, DeleteUserResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int username = 1 << 0;

				int propsSet = 0;

				if (request.username() != null)
					propsSet |= username;

				if (propsSet == (0 | 0 | username))
					return "DELETE";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int username = 1 << 0;

				int propsSet = 0;

				if (request.username() != null)
					propsSet |= username;

				if (propsSet == (0 | 0 | username)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/");
					buf.append(request.username);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, DeleteUserResponse.JSONP_PARSER);
}
