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

package co.elastic.clients.elasticsearch.eql;

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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: eql.delete.Request
public final class DeleteRequest extends RequestBase {
	private final String id;

	// ---------------------------------------------------------------------------------------------

	protected DeleteRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");

	}

	/**
	 * Identifier for the search to delete.
	 *
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteRequest> {
		private String id;

		/**
		 * Identifier for the search to delete.
		 *
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteRequest build() {

			return new DeleteRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code eql.delete}".
	 */
	public static final Endpoint<DeleteRequest, DeleteResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= id;

				if (propsSet == (0 | 0 | id))
					return "DELETE";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= id;

				if (propsSet == (0 | 0 | id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_eql");
					buf.append("/search");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, DeleteResponse.JSONP_PARSER);
}
