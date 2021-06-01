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
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: ml.stop_datafeed.Request
public final class StopDatafeedRequest extends RequestBase implements ToJsonp {
	private final List<String> datafeedId;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean force;

	@Nullable
	private final JsonValue timeout;

	// ---------------------------------------------------------------------------------------------

	protected StopDatafeedRequest(Builder builder) {

		this.datafeedId = Objects.requireNonNull(builder.datafeedId, "datafeed_id");
		this.allowNoMatch = builder.allowNoMatch;
		this.force = builder.force;
		this.timeout = builder.timeout;

	}

	/**
	 * API name: {@code datafeed_id}
	 */
	public List<String> datafeedId() {
		return this.datafeedId;
	}

	/**
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * API name: {@code force}
	 */
	@Nullable
	public Boolean force() {
		return this.force;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.force != null) {

			generator.writeKey("force");
			generator.write(this.force);

		}
		if (this.timeout != null) {

			generator.writeKey("timeout");
			generator.write(this.timeout);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopDatafeedRequest}.
	 */
	public static class Builder implements ObjectBuilder<StopDatafeedRequest> {
		private List<String> datafeedId;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean force;

		@Nullable
		private JsonValue timeout;

		/**
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(List<String> value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(String... value) {
			this.datafeedId = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #datafeedId(List)}, creating the list if needed.
		 */
		public Builder addDatafeedId(String value) {
			if (this.datafeedId == null) {
				this.datafeedId = new ArrayList<>();
			}
			this.datafeedId.add(value);
			return this;
		}

		/**
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * API name: {@code force}
		 */
		public Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link StopDatafeedRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopDatafeedRequest build() {

			return new StopDatafeedRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for StopDatafeedRequest
	 */
	public static final JsonpValueParser<StopDatafeedRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, StopDatafeedRequest::setupStopDatafeedRequestParser);

	protected static void setupStopDatafeedRequestParser(DelegatingJsonpValueParser<StopDatafeedRequest.Builder> op) {

		op.add(Builder::force, JsonpValueParser.booleanParser(), "force");
		op.add(Builder::timeout, JsonpValueParser.jsonValueParser(), "timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.stop_datafeed}".
	 */
	public static final Endpoint<StopDatafeedRequest, StopDatafeedResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int datafeedId = 1 << 0;

				int propsSet = 0;

				if (request.datafeedId() != null)
					propsSet |= datafeedId;

				if (propsSet == (0 | 0 | datafeedId | 0))
					return "POST";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int datafeedId = 1 << 0;

				int propsSet = 0;

				if (request.datafeedId() != null)
					propsSet |= datafeedId;

				if (propsSet == (0 | 0 | datafeedId | 0)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					buf.append("/");
					buf.append(request.datafeedId.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_stop");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, StopDatafeedResponse.JSONP_PARSER);
}
