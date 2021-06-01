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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: rollup.rollup_search.Request
public final class RollupSearchRequest extends RequestBase implements ToJsonp {
	private final List<String> index;

	@Nullable
	private final String type;

	@Nullable
	private final Boolean restTotalHitsAsInt;

	@Nullable
	private final Boolean typedKeys;

	@Nullable
	private final Map<String, AggregationContainer> aggs;

	@Nullable
	private final QueryContainer query;

	@Nullable
	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected RollupSearchRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.type = builder.type;
		this.restTotalHitsAsInt = builder.restTotalHitsAsInt;
		this.typedKeys = builder.typedKeys;
		this.aggs = builder.aggs;
		this.query = builder.query;
		this.size = builder.size;

	}

	/**
	 * API name: {@code index}
	 */
	public List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code rest_total_hits_as_int}
	 */
	@Nullable
	public Boolean restTotalHitsAsInt() {
		return this.restTotalHitsAsInt;
	}

	/**
	 * API name: {@code typed_keys}
	 */
	@Nullable
	public Boolean typedKeys() {
		return this.typedKeys;
	}

	/**
	 * API name: {@code aggs}
	 */
	@Nullable
	public Map<String, AggregationContainer> aggs() {
		return this.aggs;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public QueryContainer query() {
		return this.query;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
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

		if (this.aggs != null) {

			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, AggregationContainer> item0 : this.aggs.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.query != null) {

			generator.writeKey("query");
			this.query.toJsonp(generator, mapper);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupSearchRequest}.
	 */
	public static class Builder implements ObjectBuilder<RollupSearchRequest> {
		private List<String> index;

		@Nullable
		private String type;

		@Nullable
		private Boolean restTotalHitsAsInt;

		@Nullable
		private Boolean typedKeys;

		@Nullable
		private Map<String, AggregationContainer> aggs;

		@Nullable
		private QueryContainer query;

		@Nullable
		private Number size;

		/**
		 * API name: {@code index}
		 */
		public Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code rest_total_hits_as_int}
		 */
		public Builder restTotalHitsAsInt(@Nullable Boolean value) {
			this.restTotalHitsAsInt = value;
			return this;
		}

		/**
		 * API name: {@code typed_keys}
		 */
		public Builder typedKeys(@Nullable Boolean value) {
			this.typedKeys = value;
			return this;
		}

		/**
		 * API name: {@code aggs}
		 */
		public Builder aggs(@Nullable Map<String, AggregationContainer> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, AggregationContainer value) {
			if (this.aggs == null) {
				this.aggs = new HashMap<>();
			}
			this.aggs.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggs(Map)} to a singleton map.
		 */
		public Builder aggs(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this.aggs(Collections.singletonMap(key, fn.apply(new AggregationContainer.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this.putAggs(key, fn.apply(new AggregationContainer.Builder()).build());
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable QueryContainer value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link RollupSearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupSearchRequest build() {

			return new RollupSearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for RollupSearchRequest
	 */
	public static final JsonpValueParser<RollupSearchRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, RollupSearchRequest::setupRollupSearchRequestParser);

	protected static void setupRollupSearchRequestParser(DelegatingJsonpValueParser<RollupSearchRequest.Builder> op) {

		op.add(Builder::aggs, JsonpValueParser.stringMapParser(AggregationContainer.JSONP_PARSER), "aggs");
		op.add(Builder::query, QueryContainer.JSONP_PARSER, "query");
		op.add(Builder::size, JsonpValueParser.numberParser(), "size");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rollup.rollup_search}".
	 */
	private static final Endpoint.Simple<RollupSearchRequest, Void> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int index = 1 << 0;
				final int type = 1 << 1;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= index;
				if (request.type() != null)
					propsSet |= type;

				if (propsSet == (index | 0))
					return "POST";
				if (propsSet == (index | type | 0))
					return "POST";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int index = 1 << 0;
				final int type = 1 << 1;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= index;
				if (request.type() != null)
					propsSet |= type;

				if (propsSet == (index | 0)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_rollup_search");
					return buf.toString();
				}
				if (propsSet == (index | type | 0)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/");
					buf.append(request.type);
					buf.append("/_rollup_search");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.restTotalHitsAsInt != null) {
					params.put("rest_total_hits_as_int", String.valueOf(request.restTotalHitsAsInt));
				}
				if (request.typedKeys != null) {
					params.put("typed_keys", String.valueOf(request.typedKeys));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, null);

	/**
	 * Create an "{@code rollup.rollup_search}" endpoint.
	 */
	public static <TDocument> Endpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ElasticsearchError> createRollupSearchEndpoint(
			JsonpValueParser<TDocument> tDocumentParser) {
		return ENDPOINT.withResponseParser(RollupSearchResponse.createRollupSearchResponseParser(tDocumentParser));
	}
}
