package com.springjunit.demo.model.bo;



@javax.annotation.processing.Generated("dsl_json")
public class _PropertiesResponse_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		ObjectFormatConverter objectConverter = new ObjectFormatConverter(__dsljson);
		__dsljson.registerBinder(com.springjunit.demo.model.bo.PropertiesResponse.class, objectConverter);
		__dsljson.registerReader(com.springjunit.demo.model.bo.PropertiesResponse.class, objectConverter);
		__dsljson.registerWriter(com.springjunit.demo.model.bo.PropertiesResponse.class, objectConverter);
	}
	public final static class ObjectFormatConverter implements com.dslplatform.json.runtime.FormatConverter<com.springjunit.demo.model.bo.PropertiesResponse>, com.dslplatform.json.JsonReader.BindObject<com.springjunit.demo.model.bo.PropertiesResponse> {
		private final boolean alwaysSerialize;
		private final com.dslplatform.json.DslJson __dsljson;
		public ObjectFormatConverter(com.dslplatform.json.DslJson __dsljson) {
			this.alwaysSerialize = !__dsljson.omitDefaults;
			this.__dsljson = __dsljson;
		}
		public com.springjunit.demo.model.bo.PropertiesResponse read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return bind(reader, new com.springjunit.demo.model.bo.PropertiesResponse());
		}
		private static final byte[] quoted_type = "\"type\":".getBytes(utf8);
		private static final byte[] name_type = "type".getBytes(utf8);
		private static final byte[] quoted_id = ",\"id\":".getBytes(utf8);
		private static final byte[] name_id = "id".getBytes(utf8);
		private static final byte[] quoted_name = ",\"name\":".getBytes(utf8);
		private static final byte[] name_name = "name".getBytes(utf8);
		private static final byte[] quoted_code = ",\"code\":".getBytes(utf8);
		private static final byte[] name_code = "code".getBytes(utf8);
		public final void write(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.bo.PropertiesResponse instance) {
			if (instance == null) writer.writeNull();
			else {
				writer.writeByte((byte)'{');
				if (alwaysSerialize) { writeContentFull(writer, instance); writer.writeByte((byte)'}'); }
				else if (writeContentMinimal(writer, instance)) writer.getByteBuffer()[writer.size() - 1] = '}';
				else writer.writeByte((byte)'}');
			}
		}
		public void writeContentFull(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.bo.PropertiesResponse instance) {
			writer.writeAscii(quoted_type);
			if (instance.getType() == null) writer.writeNull();
			else { writer.writeByte((byte)'"'); writer.writeAscii(instance.getType().name()); writer.writeByte((byte)'"'); }
			writer.writeAscii(quoted_id);
			if (instance.getId() == null) writer.writeNull();
			else com.dslplatform.json.NumberConverter.serialize(instance.getId(), writer);
			writer.writeAscii(quoted_name);
			if (instance.getName() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getName(), writer);
			writer.writeAscii(quoted_code);
			if (instance.getCode() == null) writer.writeNull();
			else { writer.writeByte((byte)'"'); writer.writeAscii(instance.getCode().name()); writer.writeByte((byte)'"'); }
		}
		public boolean writeContentMinimal(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.bo.PropertiesResponse instance) {
			boolean hasWritten = false;
			if (instance.getType() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_type); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				{ writer.writeByte((byte)'"'); writer.writeAscii(instance.getType().name()); writer.writeByte((byte)'"'); }
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getId() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_id); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.NumberConverter.serialize(instance.getId(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getName() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_name); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getName(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getCode() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_code); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				{ writer.writeByte((byte)'"'); writer.writeAscii(instance.getCode().name()); writer.writeByte((byte)'"'); }
				writer.writeByte((byte)','); hasWritten = true;
			}
			return hasWritten;
		}
		public com.springjunit.demo.model.bo.PropertiesResponse bind(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.bo.PropertiesResponse instance) throws java.io.IOException {
			if (reader.last() != '{') throw reader.newParseError("Expecting '{' for object start");
			reader.getNextToken();
			bindContent(reader, instance);
			return instance;
		}
		public com.springjunit.demo.model.bo.PropertiesResponse readContent(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			com.springjunit.demo.model.bo.PropertiesResponse instance = new com.springjunit.demo.model.bo.PropertiesResponse();
 			bindContent(reader, instance);
			return instance;
		}
		public void bindContent(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.bo.PropertiesResponse instance) throws java.io.IOException {
			if (reader.last() == '}') return;
			if (reader.fillNameWeakHash() != 450 || !reader.wasLastName(name_type)) { bindSlow(reader, instance, 0); return; }
			reader.getNextToken();
			instance.setType(reader.wasNull() ? null : com.springjunit.demo.model.bo._PropertiesType_DslJsonConverter.EnumConverter.readStatic(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 205 || !reader.wasLastName(name_id)) { bindSlow(reader, instance, 1); return; }
			reader.getNextToken();
			instance.setId(com.dslplatform.json.NumberConverter.NULLABLE_INT_READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 417 || !reader.wasLastName(name_name)) { bindSlow(reader, instance, 2); return; }
			reader.getNextToken();
			instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 411 || !reader.wasLastName(name_code)) { bindSlow(reader, instance, 3); return; }
			reader.getNextToken();
			instance.setCode(reader.wasNull() ? null : com.springjunit.demo.model.bo._PropertiesCode_DslJsonConverter.EnumConverter.readStatic(reader));
			if (reader.getNextToken() != '}') {
				if (reader.last() == ',') {
					reader.getNextToken();
					reader.fillNameWeakHash();
					bindSlow(reader, instance, 4);
				}
				if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			}
		}
		private void bindSlow(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.bo.PropertiesResponse instance, int index) throws java.io.IOException {
			switch(reader.getLastHash()) {
				case -114201356:
					reader.getNextToken();
					instance.setCode(reader.wasNull() ? null : com.springjunit.demo.model.bo._PropertiesCode_DslJsonConverter.EnumConverter.readStatic(reader));
					reader.getNextToken();
					break;
				case -1925595674:
					reader.getNextToken();
					instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 926444256:
					reader.getNextToken();
					instance.setId(com.dslplatform.json.NumberConverter.NULLABLE_INT_READER.read(reader));
					reader.getNextToken();
					break;
				case 1361572173:
					reader.getNextToken();
					instance.setType(reader.wasNull() ? null : com.springjunit.demo.model.bo._PropertiesType_DslJsonConverter.EnumConverter.readStatic(reader));
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
					case -1925595674:
						reader.getNextToken();
						instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 926444256:
						reader.getNextToken();
						instance.setId(com.dslplatform.json.NumberConverter.NULLABLE_INT_READER.read(reader));
						reader.getNextToken();
						break;
					case 1361572173:
						reader.getNextToken();
						instance.setType(reader.wasNull() ? null : com.springjunit.demo.model.bo._PropertiesType_DslJsonConverter.EnumConverter.readStatic(reader));
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
