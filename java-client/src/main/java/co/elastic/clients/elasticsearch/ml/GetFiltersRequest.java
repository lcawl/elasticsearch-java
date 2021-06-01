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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: ml.get_filters.Request
public final class GetFiltersRequest extends RequestBase {
	@Nullable
	private final String filterId;

	@Nullable
	private final Number from;

	@Nullable
	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected GetFiltersRequest(Builder builder) {

		this.filterId = builder.filterId;
		this.from = builder.from;
		this.size = builder.size;

	}

	/**
	 * API name: {@code filter_id}
	 */
	@Nullable
	public String filterId() {
		return this.filterId;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetFiltersRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetFiltersRequest> {
		@Nullable
		private String filterId;

		@Nullable
		private Number from;

		@Nullable
		private Number size;

		/**
		 * API name: {@code filter_id}
		 */
		public Builder filterId(@Nullable String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link GetFiltersRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetFiltersRequest build() {

			return new GetFiltersRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_filters}".
	 */
	public static final Endpoint<GetFiltersRequest, GetFiltersResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int filterId = 1 << 0;

				int propsSet = 0;

				if (request.filterId() != null)
					propsSet |= filterId;

				if (propsSet == (0 | 0))
					return "GET";
				if (propsSet == (0 | 0 | filterId))
					return "GET";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int filterId = 1 << 0;

				int propsSet = 0;

				if (request.filterId() != null)
					propsSet |= filterId;

				if (propsSet == (0 | 0)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/filters");
					return buf.toString();
				}
				if (propsSet == (0 | 0 | filterId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/filters");
					buf.append("/");
					buf.append(request.filterId);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.from != null) {
					params.put("from", request.from.toString());
				}
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, GetFiltersResponse.JSONP_PARSER);
}
