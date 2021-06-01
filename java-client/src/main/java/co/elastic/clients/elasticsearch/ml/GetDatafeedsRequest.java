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
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: ml.get_datafeeds.Request
public final class GetDatafeedsRequest extends RequestBase {
	@Nullable
	private final String datafeedId;

	@Nullable
	private final Boolean allowNoDatafeeds;

	@Nullable
	private final Boolean excludeGenerated;

	// ---------------------------------------------------------------------------------------------

	protected GetDatafeedsRequest(Builder builder) {

		this.datafeedId = builder.datafeedId;
		this.allowNoDatafeeds = builder.allowNoDatafeeds;
		this.excludeGenerated = builder.excludeGenerated;

	}

	/**
	 * API name: {@code datafeed_id}
	 */
	@Nullable
	public String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * API name: {@code allow_no_datafeeds}
	 */
	@Nullable
	public Boolean allowNoDatafeeds() {
		return this.allowNoDatafeeds;
	}

	/**
	 * API name: {@code exclude_generated}
	 */
	@Nullable
	public Boolean excludeGenerated() {
		return this.excludeGenerated;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDatafeedsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetDatafeedsRequest> {
		@Nullable
		private String datafeedId;

		@Nullable
		private Boolean allowNoDatafeeds;

		@Nullable
		private Boolean excludeGenerated;

		/**
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(@Nullable String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * API name: {@code allow_no_datafeeds}
		 */
		public Builder allowNoDatafeeds(@Nullable Boolean value) {
			this.allowNoDatafeeds = value;
			return this;
		}

		/**
		 * API name: {@code exclude_generated}
		 */
		public Builder excludeGenerated(@Nullable Boolean value) {
			this.excludeGenerated = value;
			return this;
		}

		/**
		 * Builds a {@link GetDatafeedsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDatafeedsRequest build() {

			return new GetDatafeedsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_datafeeds}".
	 */
	public static final Endpoint<GetDatafeedsRequest, GetDatafeedsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int datafeedId = 1 << 0;

				int propsSet = 0;

				if (request.datafeedId() != null)
					propsSet |= datafeedId;

				if (propsSet == (0 | 0 | datafeedId))
					return "GET";
				if (propsSet == (0 | 0))
					return "GET";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int datafeedId = 1 << 0;

				int propsSet = 0;

				if (request.datafeedId() != null)
					propsSet |= datafeedId;

				if (propsSet == (0 | 0 | datafeedId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					buf.append("/");
					buf.append(request.datafeedId);
					return buf.toString();
				}
				if (propsSet == (0 | 0)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoDatafeeds != null) {
					params.put("allow_no_datafeeds", String.valueOf(request.allowNoDatafeeds));
				}
				if (request.excludeGenerated != null) {
					params.put("exclude_generated", String.valueOf(request.excludeGenerated));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, GetDatafeedsResponse.JSONP_PARSER);
}
