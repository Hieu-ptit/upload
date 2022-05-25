package com.springjunit.demo.model.bo;



@javax.annotation.processing.Generated("dsl_json")
public class _PropertiesType_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		EnumConverter enumConverter = new EnumConverter();
		__dsljson.registerWriter(com.springjunit.demo.model.bo.PropertiesType.class, enumConverter);
		__dsljson.registerReader(com.springjunit.demo.model.bo.PropertiesType.class, enumConverter);
	}
	public final static class EnumConverter implements com.dslplatform.json.JsonWriter.WriteObject<com.springjunit.demo.model.bo.PropertiesType>, com.dslplatform.json.JsonReader.ReadObject<com.springjunit.demo.model.bo.PropertiesType> {
		public void write(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.bo.PropertiesType value) {
			if (value == null) writer.writeNull();
			else {
				{ writer.writeByte((byte)'"'); writer.writeAscii(value.name()); writer.writeByte((byte)'"'); }
			}
		}
		public com.springjunit.demo.model.bo.PropertiesType read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return readStatic(reader);
		}
		public static com.springjunit.demo.model.bo.PropertiesType readStatic(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			switch (reader.calcHash()) {
				case 1918726986:
					return com.springjunit.demo.model.bo.PropertiesType.PAYMENT_METHOD_CONTRACT;
				case -1336421836:
					return com.springjunit.demo.model.bo.PropertiesType.TYPE_CONTRACT;
				case -1625723682:
					return com.springjunit.demo.model.bo.PropertiesType.TRANSPORT_METHOD;
				case -821654117:
					return com.springjunit.demo.model.bo.PropertiesType.POSITIONS;
				case -1485075641:
					return com.springjunit.demo.model.bo.PropertiesType.DEPARTMENT;
				default:
					return com.springjunit.demo.model.bo.PropertiesType.valueOf(reader.getLastName());
			}
		}
	}
}
