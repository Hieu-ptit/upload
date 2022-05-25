package com.springjunit.demo.model.request;



@javax.annotation.processing.Generated("dsl_json")
public class _PropertiesRequest_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		ObjectFormatConverter objectConverter = new ObjectFormatConverter(__dsljson);
		__dsljson.registerBinder(com.springjunit.demo.model.request.PropertiesRequest.class, objectConverter);
		__dsljson.registerReader(com.springjunit.demo.model.request.PropertiesRequest.class, objectConverter);
		__dsljson.registerWriter(com.springjunit.demo.model.request.PropertiesRequest.class, objectConverter);
	}
	public final static class ObjectFormatConverter implements com.dslplatform.json.runtime.FormatConverter<com.springjunit.demo.model.request.PropertiesRequest>, com.dslplatform.json.JsonReader.BindObject<com.springjunit.demo.model.request.PropertiesRequest> {
		private final boolean alwaysSerialize;
		private final com.dslplatform.json.DslJson __dsljson;
		public ObjectFormatConverter(com.dslplatform.json.DslJson __dsljson) {
			this.alwaysSerialize = !__dsljson.omitDefaults;
			this.__dsljson = __dsljson;
		}
		public com.springjunit.demo.model.request.PropertiesRequest read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return bind(reader, new com.springjunit.demo.model.request.PropertiesRequest());
		}
		private static final byte[] quoted_code = "\"code\":".getBytes(utf8);
		private static final byte[] name_code = "code".getBytes(utf8);
		public final void write(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.request.PropertiesRequest instance) {
			if (instance == null) writer.writeNull();
			else {
				writer.writeByte((byte)'{');
				if (alwaysSerialize) { writeContentFull(writer, instance); writer.writeByte((byte)'}'); }
				else if (writeContentMinimal(writer, instance)) writer.getByteBuffer()[writer.size() - 1] = '}';
				else writer.writeByte((byte)'}');
			}
		}
		public void writeContentFull(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.request.PropertiesRequest instance) {
			writer.writeAscii(quoted_code);
			if (instance.getCode() == null) writer.writeNull();
			else { writer.writeByte((byte)'"'); writer.writeAscii(instance.getCode().name()); writer.writeByte((byte)'"'); }
		}
		public boolean writeContentMinimal(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.request.PropertiesRequest instance) {
			boolean hasWritten = false;
			if (instance.getCode() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_code); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				{ writer.writeByte((byte)'"'); writer.writeAscii(instance.getCode().name()); writer.writeByte((byte)'"'); }
				writer.writeByte((byte)','); hasWritten = true;
			}
			return hasWritten;
		}
		public com.springjunit.demo.model.request.PropertiesRequest bind(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.request.PropertiesRequest instance) throws java.io.IOException {
			if (reader.last() != '{') throw reader.newParseError("Expecting '{' for object start");
			reader.getNextToken();
			bindContent(reader, instance);
			return instance;
		}
		public com.springjunit.demo.model.request.PropertiesRequest readContent(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			com.springjunit.demo.model.request.PropertiesRequest instance = new com.springjunit.demo.model.request.PropertiesRequest();
 			bindContent(reader, instance);
			return instance;
		}
		public void bindContent(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.request.PropertiesRequest instance) throws java.io.IOException {
			if (reader.last() == '}') return;
			if (reader.fillNameWeakHash() != 411 || !reader.wasLastName(name_code)) { bindSlow(reader, instance, 0); return; }
			reader.getNextToken();
			instance.setCode(reader.wasNull() ? null : com.springjunit.demo.model.bo._PropertiesCode_DslJsonConverter.EnumConverter.readStatic(reader));
			if (reader.getNextToken() != '}') {
				if (reader.last() == ',') {
					reader.getNextToken();
					reader.fillNameWeakHash();
					bindSlow(reader, instance, 1);
				}
				if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			}
		}
		private void bindSlow(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.request.PropertiesRequest instance, int index) throws java.io.IOException {
			switch(reader.getLastHash()) {
				case -114201356:
					reader.getNextToken();
					instance.setCode(reader.wasNull() ? null : com.springjunit.demo.model.bo._PropertiesCode_DslJsonConverter.EnumConverter.readStatic(reader));
					reader.getNextToken();
					break;
				default:
					reader.getNextToken();
					reader.skip();
			}
			while (reader.last() == ','){
				reader.getNextToken();
				switch(reader.fillName()) {
					case -114201356:
						reader.getNextToken();
						instance.setCode(reader.wasNull() ? null : com.springjunit.demo.model.bo._PropertiesCode_DslJsonConverter.EnumConverter.readStatic(reader));
						reader.getNextToken();
						break;
					default:
						reader.getNextToken();
						reader.skip();
				}
			}
			if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
		}
	}
}
