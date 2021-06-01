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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.update.Request
public final class UpdateRequest<TDocument, TPartialDocument> extends RequestBase implements ToJsonp {
	private final String id;

	private final String index;

	@Nullable
	private final String type;

	@Nullable
	private final Number ifPrimaryTerm;

	@Nullable
	private final Number ifSeqNo;

	@Nullable
	private final String lang;

	@Nullable
	private final JsonValue refresh;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final Number retryOnConflict;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final Boolean sourceEnabled;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final JsonValue waitForActiveShards;

	@Nullable
	private final List<String> _sourceExcludes;

	@Nullable
	private final List<String> _sourceIncludes;

	@Nullable
	private final Boolean detectNoop;

	@Nullable
	private final TPartialDocument doc;

	@Nullable
	private final Boolean docAsUpsert;

	@Nullable
	private final JsonValue script;

	@Nullable
	private final Boolean scriptedUpsert;

	@Nullable
	private final JsonValue _source;

	@Nullable
	private final TDocument upsert;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	@Nullable
	private final JsonpSerializer<TPartialDocument> tPartialDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected UpdateRequest(Builder<TDocument, TPartialDocument> builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.type = builder.type;
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSeqNo = builder.ifSeqNo;
		this.lang = builder.lang;
		this.refresh = builder.refresh;
		this.requireAlias = builder.requireAlias;
		this.retryOnConflict = builder.retryOnConflict;
		this.routing = builder.routing;
		this.sourceEnabled = builder.sourceEnabled;
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;
		this._sourceExcludes = builder._sourceExcludes;
		this._sourceIncludes = builder._sourceIncludes;
		this.detectNoop = builder.detectNoop;
		this.doc = builder.doc;
		this.docAsUpsert = builder.docAsUpsert;
		this.script = builder.script;
		this.scriptedUpsert = builder.scriptedUpsert;
		this._source = builder._source;
		this.upsert = builder.upsert;
		this.tDocumentSerializer = builder.tDocumentSerializer;
		this.tPartialDocumentSerializer = builder.tPartialDocumentSerializer;

	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
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
	 * API name: {@code if_primary_term}
	 */
	@Nullable
	public Number ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * API name: {@code if_seq_no}
	 */
	@Nullable
	public Number ifSeqNo() {
		return this.ifSeqNo;
	}

	/**
	 * API name: {@code lang}
	 */
	@Nullable
	public String lang() {
		return this.lang;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code require_alias}
	 */
	@Nullable
	public Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * API name: {@code retry_on_conflict}
	 */
	@Nullable
	public Number retryOnConflict() {
		return this.retryOnConflict;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code source_enabled}
	 */
	@Nullable
	public Boolean sourceEnabled() {
		return this.sourceEnabled;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * API name: {@code _source_excludes}
	 */
	@Nullable
	public List<String> _sourceExcludes() {
		return this._sourceExcludes;
	}

	/**
	 * API name: {@code _source_includes}
	 */
	@Nullable
	public List<String> _sourceIncludes() {
		return this._sourceIncludes;
	}

	/**
	 * API name: {@code detect_noop}
	 */
	@Nullable
	public Boolean detectNoop() {
		return this.detectNoop;
	}

	/**
	 * API name: {@code doc}
	 */
	@Nullable
	public TPartialDocument doc() {
		return this.doc;
	}

	/**
	 * API name: {@code doc_as_upsert}
	 */
	@Nullable
	public Boolean docAsUpsert() {
		return this.docAsUpsert;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue script() {
		return this.script;
	}

	/**
	 * API name: {@code scripted_upsert}
	 */
	@Nullable
	public Boolean scriptedUpsert() {
		return this.scriptedUpsert;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue _source() {
		return this._source;
	}

	/**
	 * API name: {@code upsert}
	 */
	@Nullable
	public TDocument upsert() {
		return this.upsert;
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

		if (this.detectNoop != null) {

			generator.writeKey("detect_noop");
			generator.write(this.detectNoop);

		}
		if (this.doc != null) {

			generator.writeKey("doc");
			JsonpUtils.serialize(this.doc, generator, tPartialDocumentSerializer, mapper);

		}
		if (this.docAsUpsert != null) {

			generator.writeKey("doc_as_upsert");
			generator.write(this.docAsUpsert);

		}
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.scriptedUpsert != null) {

			generator.writeKey("scripted_upsert");
			generator.write(this.scriptedUpsert);

		}
		if (this._source != null) {

			generator.writeKey("_source");
			generator.write(this._source);

		}
		if (this.upsert != null) {

			generator.writeKey("upsert");
			JsonpUtils.serialize(this.upsert, generator, tDocumentSerializer, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateRequest}.
	 */
	public static class Builder<TDocument, TPartialDocument>
			implements
				ObjectBuilder<UpdateRequest<TDocument, TPartialDocument>> {
		private String id;

		private String index;

		@Nullable
		private String type;

		@Nullable
		private Number ifPrimaryTerm;

		@Nullable
		private Number ifSeqNo;

		@Nullable
		private String lang;

		@Nullable
		private JsonValue refresh;

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private Number retryOnConflict;

		@Nullable
		private JsonValue routing;

		@Nullable
		private Boolean sourceEnabled;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private JsonValue waitForActiveShards;

		@Nullable
		private List<String> _sourceExcludes;

		@Nullable
		private List<String> _sourceIncludes;

		@Nullable
		private Boolean detectNoop;

		@Nullable
		private TPartialDocument doc;

		@Nullable
		private Boolean docAsUpsert;

		@Nullable
		private JsonValue script;

		@Nullable
		private Boolean scriptedUpsert;

		@Nullable
		private JsonValue _source;

		@Nullable
		private TDocument upsert;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		@Nullable
		private JsonpSerializer<TPartialDocument> tPartialDocumentSerializer;

		/**
		 * API name: {@code id}
		 */
		public Builder<TDocument, TPartialDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder<TDocument, TPartialDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder<TDocument, TPartialDocument> type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code if_primary_term}
		 */
		public Builder<TDocument, TPartialDocument> ifPrimaryTerm(@Nullable Number value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code if_seq_no}
		 */
		public Builder<TDocument, TPartialDocument> ifSeqNo(@Nullable Number value) {
			this.ifSeqNo = value;
			return this;
		}

		/**
		 * API name: {@code lang}
		 */
		public Builder<TDocument, TPartialDocument> lang(@Nullable String value) {
			this.lang = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public Builder<TDocument, TPartialDocument> refresh(@Nullable JsonValue value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code require_alias}
		 */
		public Builder<TDocument, TPartialDocument> requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * API name: {@code retry_on_conflict}
		 */
		public Builder<TDocument, TPartialDocument> retryOnConflict(@Nullable Number value) {
			this.retryOnConflict = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder<TDocument, TPartialDocument> routing(@Nullable JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code source_enabled}
		 */
		public Builder<TDocument, TPartialDocument> sourceEnabled(@Nullable Boolean value) {
			this.sourceEnabled = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder<TDocument, TPartialDocument> timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder<TDocument, TPartialDocument> waitForActiveShards(@Nullable JsonValue value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * API name: {@code _source_excludes}
		 */
		public Builder<TDocument, TPartialDocument> _sourceExcludes(@Nullable List<String> value) {
			this._sourceExcludes = value;
			return this;
		}

		/**
		 * API name: {@code _source_excludes}
		 */
		public Builder<TDocument, TPartialDocument> _sourceExcludes(String... value) {
			this._sourceExcludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #_sourceExcludes(List)}, creating the list if needed.
		 */
		public Builder<TDocument, TPartialDocument> add_sourceExcludes(String value) {
			if (this._sourceExcludes == null) {
				this._sourceExcludes = new ArrayList<>();
			}
			this._sourceExcludes.add(value);
			return this;
		}

		/**
		 * API name: {@code _source_includes}
		 */
		public Builder<TDocument, TPartialDocument> _sourceIncludes(@Nullable List<String> value) {
			this._sourceIncludes = value;
			return this;
		}

		/**
		 * API name: {@code _source_includes}
		 */
		public Builder<TDocument, TPartialDocument> _sourceIncludes(String... value) {
			this._sourceIncludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #_sourceIncludes(List)}, creating the list if needed.
		 */
		public Builder<TDocument, TPartialDocument> add_sourceIncludes(String value) {
			if (this._sourceIncludes == null) {
				this._sourceIncludes = new ArrayList<>();
			}
			this._sourceIncludes.add(value);
			return this;
		}

		/**
		 * API name: {@code detect_noop}
		 */
		public Builder<TDocument, TPartialDocument> detectNoop(@Nullable Boolean value) {
			this.detectNoop = value;
			return this;
		}

		/**
		 * API name: {@code doc}
		 */
		public Builder<TDocument, TPartialDocument> doc(@Nullable TPartialDocument value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code doc_as_upsert}
		 */
		public Builder<TDocument, TPartialDocument> docAsUpsert(@Nullable Boolean value) {
			this.docAsUpsert = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder<TDocument, TPartialDocument> script(@Nullable JsonValue value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code scripted_upsert}
		 */
		public Builder<TDocument, TPartialDocument> scriptedUpsert(@Nullable Boolean value) {
			this.scriptedUpsert = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder<TDocument, TPartialDocument> _source(@Nullable JsonValue value) {
			this._source = value;
			return this;
		}

		/**
		 * API name: {@code upsert}
		 */
		public Builder<TDocument, TPartialDocument> upsert(@Nullable TDocument value) {
			this.upsert = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TDocument, TPartialDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Serializer for TPartialDocument. If not set, an attempt will be made to find
		 * a serializer from the JSON context.
		 *
		 */
		public Builder<TDocument, TPartialDocument> tPartialDocumentSerializer(
				@Nullable JsonpSerializer<TPartialDocument> value) {
			this.tPartialDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link UpdateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateRequest<TDocument, TPartialDocument> build() {

			return new UpdateRequest<TDocument, TPartialDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json parser for UpdateRequest
	 */
	public static <TDocument, TPartialDocument> JsonpValueParser<UpdateRequest<TDocument, TPartialDocument>> createUpdateRequestParser(
			JsonpValueParser<TDocument> tDocumentParser, JsonpValueParser<TPartialDocument> tPartialDocumentParser) {
		return JsonpObjectBuilderParser.createForObject((Supplier<Builder<TDocument, TPartialDocument>>) Builder::new,
				op -> UpdateRequest.setupUpdateRequestParser(op, tDocumentParser, tPartialDocumentParser));
	};

	protected static <TDocument, TPartialDocument> void setupUpdateRequestParser(
			DelegatingJsonpValueParser<UpdateRequest.Builder<TDocument, TPartialDocument>> op,
			JsonpValueParser<TDocument> tDocumentParser, JsonpValueParser<TPartialDocument> tPartialDocumentParser) {

		op.add(Builder::detectNoop, JsonpValueParser.booleanParser(), "detect_noop");
		op.add(Builder::doc, tPartialDocumentParser, "doc");
		op.add(Builder::docAsUpsert, JsonpValueParser.booleanParser(), "doc_as_upsert");
		op.add(Builder::script, JsonpValueParser.jsonValueParser(), "script");
		op.add(Builder::scriptedUpsert, JsonpValueParser.booleanParser(), "scripted_upsert");
		op.add(Builder::_source, JsonpValueParser.jsonValueParser(), "_source");
		op.add(Builder::upsert, tDocumentParser, "upsert");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code update}".
	 */
	private static final Endpoint.Simple<UpdateRequest<?, ?>, Void> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int id = 1 << 0;
				final int index = 1 << 1;
				final int type = 1 << 2;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= id;
				if (request.index() != null)
					propsSet |= index;
				if (request.type() != null)
					propsSet |= type;

				if (propsSet == (index | 0 | id))
					return "POST";
				if (propsSet == (index | type | id | 0))
					return "POST";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int id = 1 << 0;
				final int index = 1 << 1;
				final int type = 1 << 2;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= id;
				if (request.index() != null)
					propsSet |= index;
				if (request.type() != null)
					propsSet |= type;

				if (propsSet == (index | 0 | id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_update");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				if (propsSet == (index | type | id | 0)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/");
					buf.append(request.type);
					buf.append("/");
					buf.append(request.id);
					buf.append("/_update");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ifPrimaryTerm != null) {
					params.put("if_primary_term", request.ifPrimaryTerm.toString());
				}
				if (request.ifSeqNo != null) {
					params.put("if_seq_no", request.ifSeqNo.toString());
				}
				if (request.lang != null) {
					params.put("lang", request.lang);
				}
				if (request.refresh != null) {
					params.put("refresh", request.refresh.toString());
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				if (request.retryOnConflict != null) {
					params.put("retry_on_conflict", request.retryOnConflict.toString());
				}
				if (request.routing != null) {
					params.put("routing", request.routing.toString());
				}
				if (request.sourceEnabled != null) {
					params.put("source_enabled", String.valueOf(request.sourceEnabled));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards.toString());
				}
				if (request._sourceExcludes != null) {
					params.put("_source_excludes",
							request._sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request._sourceIncludes != null) {
					params.put("_source_includes",
							request._sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, null);

	/**
	 * Create an "{@code update}" endpoint.
	 */
	public static <TDocument> Endpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ElasticsearchError> createUpdateEndpoint(
			JsonpValueParser<TDocument> tDocumentParser) {
		return ENDPOINT.withResponseParser(UpdateResponse.createUpdateResponseParser(tDocumentParser));
	}
}
