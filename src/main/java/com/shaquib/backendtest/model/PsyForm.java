package com.shaquib.backendtest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "form_data", catalog = "psychometric_form")

public class PsyForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String question1;

	private String question2;

	private String question3;

	private String question4;
	private String question5;
	private String question6;
	private String question7;
	private String question8;
	private String question9;
	private String question10;
	private String question11;
	private String question12;
	private String question13;
	private String question14;
	private String question15;
	private String question16;
	private String question17;
	private String question18;
	private String question19;
	private String question20;
	private String question21;
	private String question22;
	private String question23;
	private String question24;
	private String question25;
	private String question26;
	private String question27;
	private String question28;
	private String question29;
	private String question30;
	private String question31;
	private String question32;
	private String question33;
	private String question34;
	private String question35;
	private String question36;
	private String question37;
	private String question38;
	private String question39;
	private String question40;
	private String question41;
	private String question42;
	private String question43;
	private String question44;
	private String question45;
	private String question46;
	private String question47;
	private String question48;
	private String question49;
	private String question50;
	private String question51;
	private String question52;
	private String question53;
	private String question54;
	private String question55;
	private String question56;
	private String question57;
	private String question58;
	private String question59;
	private String question60;
	private String question61;
	private String question62;
	private String question63;
	private String question64;
	private String question65;
	private String question66;
	private String question67;
	private String question68;
	private String question69;
	private String question70;
	private String question71;
	private String question72;
	private String question73;
	private String question74;
	private String question75;
	private String question76;
	private String question77;
	private String question78;
	private String question79;
	private String question80;
	private String question81;
	private String question82;
	private String question83;
	private String question84;
	private String question85;
	private String question86;
	private String question87;
	private String question88;
	private String question89;
	private String question90;
	private String question91;
	private String question92;
	private String question93;
	private String question94;
	private String question95;
	private String question96;
	private String question97;
	private String question98;
	private String question99;
	private String question100;
	private String question101;
	private String question102;
	private String question103;
	private String question104;

	public PsyForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PsyForm(int id, String question1,String question2,String question3,String question4, String question5, String question6,
			String question7, String question8, String question9, String question10,
			String question11,
			String question12, String question13, String question14, String question15, String question16,
			String question17, String question18, String question19, String question20, String question21,
			String question22, String question23, String question24, String question25, String question26,
			String question27, String question28, String question29, String question30, String question31,
			String question32, String question33, String question34, String question35, String question36,
			String question37, String question38, String question39, String question40, String question41,
			String question42, String question43, String question44, String question45, String question46,
			String question47, String question48, String question49, String question50, String question51,
			String question52, String question53, String question54, String question55, String question56,
			String question57, String question58, String question59, String question60, String question61,
			String question62, String question63, String question64, String question65, String question66,
			String question67, String question68, String question69, String question70, String question71,
			String question72, String question73, String question74, String question75, String question76,
			String question77, String question78, String question79, String question80, String question81,
			String question82, String question83, String question84, String question85, String question86,
			String question87, String question88, String question89, String question90, String question91,
			String question92, String question93, String question94, String question95, String question96,
			String question97, String question98, String question99, String question100, String question101,
			String question102, String question103, String question104) {
		super();
		this.id = id;
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.question4 = question4;
		this.question5 = question5;
		this.question6 = question6;
		this.question7 = question7;
		this.question8 = question8;
		this.question9 = question9;
		this.question10 = question10;
		this.question11 = question11;
		this.question12 = question12;
		this.question13 = question13;
		this.question14 = question14;
		this.question15 = question15;
		this.question16 = question16;
		this.question17 = question17;
		this.question18 = question18;
		this.question19 = question19;
		this.question20 = question20;
		this.question21 = question21;
		this.question22 = question22;
		this.question23 = question23;
		this.question24 = question24;
		this.question25 = question25;
		this.question26 = question26;
		this.question27 = question27;
		this.question28 = question28;
		this.question29 = question29;
		this.question30 = question30;
		this.question31 = question31;
		this.question32 = question32;
		this.question33 = question33;
		this.question34 = question34;
		this.question35 = question35;
		this.question36 = question36;
		this.question37 = question37;
		this.question38 = question38;
		this.question39 = question39;
		this.question40 = question40;
		this.question41 = question41;
		this.question42 = question42;
		this.question43 = question43;
		this.question44 = question44;
		this.question45 = question45;
		this.question46 = question46;
		this.question47 = question47;
		this.question48 = question48;
		this.question49 = question49;
		this.question50 = question50;
		this.question51 = question51;
		this.question52 = question52;
		this.question53 = question53;
		this.question54 = question54;
		this.question55 = question55;
		this.question56 = question56;
		this.question57 = question57;
		this.question58 = question58;
		this.question59 = question59;
		this.question60 = question60;
		this.question61 = question61;
		this.question62 = question62;
		this.question63 = question63;
		this.question64 = question64;
		this.question65 = question65;
		this.question66 = question66;
		this.question67 = question67;
		this.question68 = question68;
		this.question69 = question69;
		this.question70 = question70;
		this.question71 = question71;
		this.question72 = question72;
		this.question73 = question73;
		this.question74 = question74;
		this.question75 = question75;
		this.question76 = question76;
		this.question77 = question77;
		this.question78 = question78;
		this.question79 = question79;
		this.question80 = question80;
		this.question81 = question81;
		this.question82 = question82;
		this.question83 = question83;
		this.question84 = question84;
		this.question85 = question85;
		this.question86 = question86;
		this.question87 = question87;
		this.question88 = question88;
		this.question89 = question89;
		this.question90 = question90;
		this.question91 = question91;
		this.question92 = question92;
		this.question93 = question93;
		this.question94 = question94;
		this.question95 = question95;
		this.question96 = question96;
		this.question97 = question97;
		this.question98 = question98;
		this.question99 = question99;
		this.question100 = question100;
		this.question101 = question101;
		this.question102 = question102;
		this.question103 = question103;
		this.question104 = question104;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	public String getQuestion3() {
		return question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	public String getQuestion4() {
		return question4;
	}

	public void setQuestion4(String question4) {
		this.question4 = question4;
	}
	public String getQuestion5() {
		return question5;
	}

	public void setQuestion5(String question5) {
		this.question5 = question5;
	}

	public String getQuestion6() {
		return question6;
	}

	public void setQuestion6(String question6) {
		this.question6 = question6;
	}

	public String getQuestion7() {
		return question7;
	}

	public void setQuestion7(String question7) {
		this.question7 = question7;
	}

	public String getQuestion8() {
		return question8;
	}

	public void setQuestion8(String question8) {
		this.question8 = question8;
	}

	public String getQuestion9() {
		return question9;
	}

	public void setQuestion9(String question9) {
		this.question9 = question9;
	}

	public String getQuestion10() {
		return question10;
	}

	public void setQuestion10(String question10) {
		this.question10 = question10;
	}

	public String getQuestion11() {
		return question11;
	}

	public void setQuestion11(String question11) {
		this.question11 = question11;
	}

	public String getQuestion12() {
		return question12;
	}

	public void setQuestion12(String question12) {
		this.question12 = question12;
	}

	public String getQuestion13() {
		return question13;
	}

	public void setQuestion13(String question13) {
		this.question13 = question13;
	}

	public String getQuestion14() {
		return question14;
	}

	public void setQuestion14(String question14) {
		this.question14 = question14;
	}

	public String getQuestion15() {
		return question15;
	}

	public void setQuestion15(String question15) {
		this.question15 = question15;
	}

	public String getQuestion16() {
		return question16;
	}

	public void setQuestion16(String question16) {
		this.question16 = question16;
	}

	public String getQuestion17() {
		return question17;
	}

	public void setQuestion17(String question17) {
		this.question17 = question17;
	}

	public String getQuestion18() {
		return question18;
	}

	public void setQuestion18(String question18) {
		this.question18 = question18;
	}

	public String getQuestion19() {
		return question19;
	}

	public void setQuestion19(String question19) {
		this.question19 = question19;
	}

	public String getQuestion20() {
		return question20;
	}

	public void setQuestion20(String question20) {
		this.question20 = question20;
	}

	public String getQuestion21() {
		return question21;
	}

	public void setQuestion21(String question21) {
		this.question21 = question21;
	}

	public String getQuestion22() {
		return question22;
	}

	public void setQuestion22(String question22) {
		this.question22 = question22;
	}

	public String getQuestion23() {
		return question23;
	}

	public void setQuestion23(String question23) {
		this.question23 = question23;
	}

	public String getQuestion24() {
		return question24;
	}

	public void setQuestion24(String question24) {
		this.question24 = question24;
	}

	public String getQuestion25() {
		return question25;
	}

	public void setQuestion25(String question25) {
		this.question25 = question25;
	}

	public String getQuestion26() {
		return question26;
	}

	public void setQuestion26(String question26) {
		this.question26 = question26;
	}

	public String getQuestion27() {
		return question27;
	}

	public void setQuestion27(String question27) {
		this.question27 = question27;
	}

	public String getQuestion28() {
		return question28;
	}

	public void setQuestion28(String question28) {
		this.question28 = question28;
	}

	public String getQuestion29() {
		return question29;
	}

	public void setQuestion29(String question29) {
		this.question29 = question29;
	}

	public String getQuestion30() {
		return question30;
	}

	public void setQuestion30(String question30) {
		this.question30 = question30;
	}

	public String getQuestion31() {
		return question31;
	}

	public void setQuestion31(String question31) {
		this.question31 = question31;
	}

	public String getQuestion32() {
		return question32;
	}

	public void setQuestion32(String question32) {
		this.question32 = question32;
	}

	public String getQuestion33() {
		return question33;
	}

	public void setQuestion33(String question33) {
		this.question33 = question33;
	}

	public String getQuestion34() {
		return question34;
	}

	public void setQuestion34(String question34) {
		this.question34 = question34;
	}

	public String getQuestion35() {
		return question35;
	}

	public void setQuestion35(String question35) {
		this.question35 = question35;
	}

	public String getQuestion36() {
		return question36;
	}

	public void setQuestion36(String question36) {
		this.question36 = question36;
	}

	public String getQuestion37() {
		return question37;
	}

	public void setQuestion37(String question37) {
		this.question37 = question37;
	}

	public String getQuestion38() {
		return question38;
	}

	public void setQuestion38(String question38) {
		this.question38 = question38;
	}

	public String getQuestion39() {
		return question39;
	}

	public void setQuestion39(String question39) {
		this.question39 = question39;
	}

	public String getQuestion40() {
		return question40;
	}

	public void setQuestion40(String question40) {
		this.question40 = question40;
	}

	public String getQuestion41() {
		return question41;
	}

	public void setQuestion41(String question41) {
		this.question41 = question41;
	}

	public String getQuestion42() {
		return question42;
	}

	public void setQuestion42(String question42) {
		this.question42 = question42;
	}

	public String getQuestion43() {
		return question43;
	}

	public void setQuestion43(String question43) {
		this.question43 = question43;
	}

	public String getQuestion44() {
		return question44;
	}

	public void setQuestion44(String question44) {
		this.question44 = question44;
	}

	public String getQuestion45() {
		return question45;
	}

	public void setQuestion45(String question45) {
		this.question45 = question45;
	}

	public String getQuestion46() {
		return question46;
	}

	public void setQuestion46(String question46) {
		this.question46 = question46;
	}

	public String getQuestion47() {
		return question47;
	}

	public void setQuestion47(String question47) {
		this.question47 = question47;
	}

	public String getQuestion48() {
		return question48;
	}

	public void setQuestion48(String question48) {
		this.question48 = question48;
	}

	public String getQuestion49() {
		return question49;
	}

	public void setQuestion49(String question49) {
		this.question49 = question49;
	}

	public String getQuestion50() {
		return question50;
	}

	public void setQuestion50(String question50) {
		this.question50 = question50;
	}

	public String getQuestion51() {
		return question51;
	}

	public void setQuestion51(String question51) {
		this.question51 = question51;
	}

	public String getQuestion52() {
		return question52;
	}

	public void setQuestion52(String question52) {
		this.question52 = question52;
	}

	public String getQuestion53() {
		return question53;
	}

	public void setQuestion53(String question53) {
		this.question53 = question53;
	}

	public String getQuestion54() {
		return question54;
	}

	public void setQuestion54(String question54) {
		this.question54 = question54;
	}

	public String getQuestion55() {
		return question55;
	}

	public void setQuestion55(String question55) {
		this.question55 = question55;
	}

	public String getQuestion56() {
		return question56;
	}

	public void setQuestion56(String question56) {
		this.question56 = question56;
	}

	public String getQuestion57() {
		return question57;
	}

	public void setQuestion57(String question57) {
		this.question57 = question57;
	}

	public String getQuestion58() {
		return question58;
	}

	public void setQuestion58(String question58) {
		this.question58 = question58;
	}

	public String getQuestion59() {
		return question59;
	}

	public void setQuestion59(String question59) {
		this.question59 = question59;
	}

	public String getQuestion60() {
		return question60;
	}

	public void setQuestion60(String question60) {
		this.question60 = question60;
	}

	public String getQuestion61() {
		return question61;
	}

	public void setQuestion61(String question61) {
		this.question61 = question61;
	}

	public String getQuestion62() {
		return question62;
	}

	public void setQuestion62(String question62) {
		this.question62 = question62;
	}

	public String getQuestion63() {
		return question63;
	}

	public void setQuestion63(String question63) {
		this.question63 = question63;
	}

	public String getQuestion64() {
		return question64;
	}

	public void setQuestion64(String question64) {
		this.question64 = question64;
	}

	public String getQuestion65() {
		return question65;
	}

	public void setQuestion65(String question65) {
		this.question65 = question65;
	}

	public String getQuestion66() {
		return question66;
	}

	public void setQuestion66(String question66) {
		this.question66 = question66;
	}

	public String getQuestion67() {
		return question67;
	}

	public void setQuestion67(String question67) {
		this.question67 = question67;
	}

	public String getQuestion68() {
		return question68;
	}

	public void setQuestion68(String question68) {
		this.question68 = question68;
	}

	public String getQuestion69() {
		return question69;
	}

	public void setQuestion69(String question69) {
		this.question69 = question69;
	}

	public String getQuestion70() {
		return question70;
	}

	public void setQuestion70(String question70) {
		this.question70 = question70;
	}

	public String getQuestion71() {
		return question71;
	}

	public void setQuestion71(String question71) {
		this.question71 = question71;
	}

	public String getQuestion72() {
		return question72;
	}

	public void setQuestion72(String question72) {
		this.question72 = question72;
	}

	public String getQuestion73() {
		return question73;
	}

	public void setQuestion73(String question73) {
		this.question73 = question73;
	}

	public String getQuestion74() {
		return question74;
	}

	public void setQuestion74(String question74) {
		this.question74 = question74;
	}

	public String getQuestion75() {
		return question75;
	}

	public void setQuestion75(String question75) {
		this.question75 = question75;
	}

	public String getQuestion76() {
		return question76;
	}

	public void setQuestion76(String question76) {
		this.question76 = question76;
	}

	public String getQuestion77() {
		return question77;
	}

	public void setQuestion77(String question77) {
		this.question77 = question77;
	}

	public String getQuestion78() {
		return question78;
	}

	public void setQuestion78(String question78) {
		this.question78 = question78;
	}

	public String getQuestion79() {
		return question79;
	}

	public void setQuestion79(String question79) {
		this.question79 = question79;
	}

	public String getQuestion80() {
		return question80;
	}

	public void setQuestion80(String question80) {
		this.question80 = question80;
	}

	public String getQuestion81() {
		return question81;
	}

	public void setQuestion81(String question81) {
		this.question81 = question81;
	}

	public String getQuestion82() {
		return question82;
	}

	public void setQuestion82(String question82) {
		this.question82 = question82;
	}

	public String getQuestion83() {
		return question83;
	}

	public void setQuestion83(String question83) {
		this.question83 = question83;
	}

	public String getQuestion84() {
		return question84;
	}

	public void setQuestion84(String question84) {
		this.question84 = question84;
	}

	public String getQuestion85() {
		return question85;
	}

	public void setQuestion85(String question85) {
		this.question85 = question85;
	}

	public String getQuestion86() {
		return question86;
	}

	public void setQuestion86(String question86) {
		this.question86 = question86;
	}

	public String getQuestion87() {
		return question87;
	}

	public void setQuestion87(String question87) {
		this.question87 = question87;
	}

	public String getQuestion88() {
		return question88;
	}

	public void setQuestion88(String question88) {
		this.question88 = question88;
	}

	public String getQuestion89() {
		return question89;
	}

	public void setQuestion89(String question89) {
		this.question89 = question89;
	}

	public String getQuestion90() {
		return question90;
	}

	public void setQuestion90(String question90) {
		this.question90 = question90;
	}

	public String getQuestion91() {
		return question91;
	}

	public void setQuestion91(String question91) {
		this.question91 = question91;
	}

	public String getQuestion92() {
		return question92;
	}

	public void setQuestion92(String question92) {
		this.question92 = question92;
	}

	public String getQuestion93() {
		return question93;
	}

	public void setQuestion93(String question93) {
		this.question93 = question93;
	}

	public String getQuestion94() {
		return question94;
	}

	public void setQuestion94(String question94) {
		this.question94 = question94;
	}

	public String getQuestion95() {
		return question95;
	}

	public void setQuestion95(String question95) {
		this.question95 = question95;
	}

	public String getQuestion96() {
		return question96;
	}

	public void setQuestion96(String question96) {
		this.question96 = question96;
	}

	public String getQuestion97() {
		return question97;
	}

	public void setQuestion97(String question97) {
		this.question97 = question97;
	}

	public String getQuestion98() {
		return question98;
	}

	public void setQuestion98(String question98) {
		this.question98 = question98;
	}

	public String getQuestion99() {
		return question99;
	}

	public void setQuestion99(String question99) {
		this.question99 = question99;
	}

	public String getQuestion100() {
		return question100;
	}

	public void setQuestion100(String question100) {
		this.question100 = question100;
	}

	public String getQuestion101() {
		return question101;
	}

	public void setQuestion101(String question101) {
		this.question101 = question101;
	}

	public String getQuestion102() {
		return question102;
	}

	public void setQuestion102(String question102) {
		this.question102 = question102;
	}

	public String getQuestion103() {
		return question103;
	}

	public void setQuestion103(String question103) {
		this.question103 = question103;
	}

	public String getQuestion104() {
		return question104;
	}

	public void setQuestion104(String question104) {
		this.question104 = question104;
	}

}
