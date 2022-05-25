package com.springjunit.demo.model.bo;



@javax.annotation.processing.Generated("dsl_json")
public class _PropertiesCode_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		EnumConverter enumConverter = new EnumConverter();
		__dsljson.registerWriter(com.springjunit.demo.model.bo.PropertiesCode.class, enumConverter);
		__dsljson.registerReader(com.springjunit.demo.model.bo.PropertiesCode.class, enumConverter);
	}
	public final static class EnumConverter implements com.dslplatform.json.JsonWriter.WriteObject<com.springjunit.demo.model.bo.PropertiesCode>, com.dslplatform.json.JsonReader.ReadObject<com.springjunit.demo.model.bo.PropertiesCode> {
		public void write(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.bo.PropertiesCode value) {
			if (value == null) writer.writeNull();
			else {
				{ writer.writeByte((byte)'"'); writer.writeAscii(value.name()); writer.writeByte((byte)'"'); }
			}
		}
		public com.springjunit.demo.model.bo.PropertiesCode read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return readStatic(reader);
		}
		public static com.springjunit.demo.model.bo.PropertiesCode readStatic(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			switch (reader.calcHash()) {
				case 712639499:
					return com.springjunit.demo.model.bo.PropertiesCode.PRE_PAY;
				case -1585063406:
					return com.springjunit.demo.model.bo.PropertiesCode.PLAN;
				case -747149870:
					return com.springjunit.demo.model.bo.PropertiesCode.CASH;
				case -1109906298:
					return com.springjunit.demo.model.bo.PropertiesCode.TRANSFER;
				case -449314408:
					return com.springjunit.demo.model.bo.PropertiesCode.TGD;
				case 1256727932:
					return com.springjunit.demo.model.bo.PropertiesCode.PGDTT;
				case 1295358955:
					return com.springjunit.demo.model.bo.PropertiesCode.PGDKD;
				case -202365590:
					return com.springjunit.demo.model.bo.PropertiesCode.KTT;
				case 988729210:
					return com.springjunit.demo.model.bo.PropertiesCode.KT;
				case 670395734:
					return com.springjunit.demo.model.bo.PropertiesCode.TQ;
				case 502619544:
					return com.springjunit.demo.model.bo.PropertiesCode.TK;
				case 687173353:
					return com.springjunit.demo.model.bo.PropertiesCode.TP;
				case 719742853:
					return com.springjunit.demo.model.bo.PropertiesCode.NV;
				case 661112755:
					return com.springjunit.demo.model.bo.PropertiesCode.TTT;
				case 754283829:
					return com.springjunit.demo.model.bo.PropertiesCode.TT;
				case 2130489872:
					return com.springjunit.demo.model.bo.PropertiesCode.QL;
				case 1264566126:
					return com.springjunit.demo.model.bo.PropertiesCode.CHT;
				case 720728591:
					return com.springjunit.demo.model.bo.PropertiesCode.TV;
				case 719154473:
					return com.springjunit.demo.model.bo.PropertiesCode.BV;
				case 821394305:
					return com.springjunit.demo.model.bo.PropertiesCode.TX;
				case -1708730860:
					return com.springjunit.demo.model.bo.PropertiesCode.HDQT;
				case -487430241:
					return com.springjunit.demo.model.bo.PropertiesCode.TCKT;
				case -36742433:
					return com.springjunit.demo.model.bo.PropertiesCode.HCNS;
				case 1220874490:
					return com.springjunit.demo.model.bo.PropertiesCode.QLCLVTS;
				case 720287306:
					return com.springjunit.demo.model.bo.PropertiesCode.KD;
				case 1029324815:
					return com.springjunit.demo.model.bo.PropertiesCode.QLKT;
				case -1489490340:
					return com.springjunit.demo.model.bo.PropertiesCode.CNTT;
				case 608955517:
					return com.springjunit.demo.model.bo.PropertiesCode.TOK;
				case -1045374062:
					return com.springjunit.demo.model.bo.PropertiesCode.CHXD;
				case 770016657:
					return com.springjunit.demo.model.bo.PropertiesCode.DVT;
				default:
					return com.springjunit.demo.model.bo.PropertiesCode.valueOf(reader.getLastName());
			}
		}
	}
}
