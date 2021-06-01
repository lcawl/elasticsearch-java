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

package co.elastic.clients.elasticsearch.sql;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: sql.translate.Request
public final class TranslateRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final Number fetchSize;

	@Nullable
	private final QueryContainer filter;

	private final String query;

	@Nullable
	private final String timeZone;

	// ---------------------------------------------------------------------------------------------

	protected TranslateRequest(Builder builder) {

		this.fetchSize = builder.fetchSize;
		this.filter = builder.filter;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.timeZone = builder.timeZone;

	}

	/**
	 * API name: {@code fetch_size}
	 */
	@Nullable
	public Number fetchSize() {
		return this.fetchSize;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public QueryContainer filter() {
		return this.filter;
	}

	/**
	 * API name: {@code query}
	 */
	public String query() {
		return this.query;
	}

	/**
	 * API name: {@code time_zone}
	 */
	@Nullable
	public String timeZone() {
		return this.timeZone;
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

		if (this.fetchSize != null) {

			generator.writeKey("fetch_size");
			generator.write(this.fetchSize.doubleValue());

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.toJsonp(generator, mapper);

		}

		generator.writeKey("query");
		generator.write(this.query);

		if (this.timeZone != null) {

			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TranslateRequest}.
	 */
	public static class Builder implements ObjectBuilder<TranslateRequest> {
		@Nullable
		private Number fetchSize;

		@Nullable
		private QueryContainer filter;

		private String query;

		@Nullable
		private String timeZone;

		/**
		 * API name: {@code fetch_size}
		 */
		public Builder fetchSize(@Nullable Number value) {
			this.fetchSize = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable QueryContainer value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.filter(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code time_zone}
		 */
		public Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * Builds a {@link TranslateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TranslateRequest build() {

			return new TranslateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for TranslateRequest
	 */
	public static final JsonpValueParser<TranslateRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, TranslateRequest::setupTranslateRequestParser);

	protected static void setupTranslateRequestParser(DelegatingJsonpValueParser<TranslateRequest.Builder> op) {

		op.add(Builder::fetchSize, JsonpValueParser.numberParser(), "fetch_size");
		op.add(Builder::filter, QueryContainer.JSONP_PARSER, "filter");
		op.add(Builder::query, JsonpValueParser.stringParser(), "query");
		op.add(Builder::timeZone, JsonpValueParser.stringParser(), "time_zone");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code sql.translate}".
	 */
	public static final Endpoint<TranslateRequest, TranslateResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_sql/translate";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, TranslateResponse.JSONP_PARSER);
}
