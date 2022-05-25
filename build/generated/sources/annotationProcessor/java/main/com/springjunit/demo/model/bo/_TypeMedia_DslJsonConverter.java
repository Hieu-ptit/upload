package com.springjunit.demo.model.bo;



@javax.annotation.processing.Generated("dsl_json")
public class _TypeMedia_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		EnumConverter enumConverter = new EnumConverter();
		__dsljson.registerWriter(com.springjunit.demo.model.bo.TypeMedia.class, enumConverter);
		__dsljson.registerReader(com.springjunit.demo.model.bo.TypeMedia.class, enumConverter);
	}
	public final static class EnumConverter implements com.dslplatform.json.JsonWriter.WriteObject<com.springjunit.demo.model.bo.TypeMedia>, com.dslplatform.json.JsonReader.ReadObject<com.springjunit.demo.model.bo.TypeMedia> {
		public void write(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.bo.TypeMedia value) {
			if (value == null) writer.writeNull();
			else {
				{ writer.writeByte((byte)'"'); writer.writeAscii(value.name()); writer.writeByte((byte)'"'); }
			}
		}
		public com.springjunit.demo.model.bo.TypeMedia read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return readStatic(reader);
		}
		public static com.springjunit.demo.model.bo.TypeMedia readStatic(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			switch (reader.calcHash()) {
				case 1538971482:
					return com.springjunit.demo.model.bo.TypeMedia.IMAGE;
				case 859270736:
					return com.springjunit.demo.model.bo.TypeMedia.EXCEL;
				case 1894199125:
					return com.springjunit.demo.model.bo.TypeMedia.OTHER;
				case 1828839741:
					return com.springjunit.demo.model.bo.TypeMedia.WORD;
				default:
					return com.springjunit.demo.model.bo.TypeMedia.valueOf(reader.getLastName());
			}
		}
	}
}
