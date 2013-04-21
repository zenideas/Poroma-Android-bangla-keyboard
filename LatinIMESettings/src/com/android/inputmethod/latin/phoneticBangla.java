package com.android.inputmethod.latin;

import java.util.HashMap;

public class phoneticBangla {

	public HashMap<String, String> srb = new HashMap<String, String>();
	public HashMap<String, String> kar = new HashMap<String, String>();
	public HashMap<String, String> bbr = new HashMap<String, String>();
	public HashMap<String, String> jbr = new HashMap<String, String>();
	public HashMap<String, String> other = new HashMap<String, String>();

	public String schar[] = { "A", "W", "w", "F", "E", "V", "N", "a", "i", "I",
			"u", "U", "e", "o", "O", "k", "g", "c", "j", "T", "D", "t", "d",
			"n", "p", "f", "b", "v", "m", "z", "r", "l", "S", "s", "h", "R",
			"y", "Y", ":", "q", "Q", "P", "G", "H", "J", "K", "L", "C", "V",
			"B", "M", "Z", "^" };
	public String dchar[] = { "rr", "ng", "Tw", "Tm", "Ty", "DD", "Dy", "NT",
			"nc", "jj", "jy", "jr", "jw", "cy", "gg", "kt", "hh", "HH", "SH",
			"tT", "hl", "hr", "hy", "hm", "hw", "sp", "sn", "st", "sT", "hn",
			"hN", "sl", "sr", "sy", "sm", "sw", "sf", "Sl", "Sr", "Sy", "Sm",
			"Sw", "Sn", "St", "sk", "lg", "lk", "zy", "ml", "Sc", "ll", "ly",
			"lm", "lv", "lw", "lb", "lp", "lD", "lT", "bl", "br", "by", "bb",
			"bd", "bj", "fl", "mr", "my", "mm", "mv", "mw", "mb", "mf", "mp",
			"mn", "vl", "vr", "vy", "nw", "nn", "fr", "ps", "pl", "pr", "py",
			"pp", "pn", "pt", "pT", "ns", "ny", "nm", "dr", "dy", "dm", "dv",
			"dw", "nd", "nt", "nD", "nT", "Ny", "Nm", "Nw", "Nn", "dd", "dg",
			"tr", "ty", "tm", "tw", "tn", "tt", "TT", "nj", "ee", "oo", "OI",
			"OU", "kh", "gh", "Ng", "ch", "jh", "NG", "Th", "Dh", "th", "dh",
			"ph", "bh", "sh", "Sh", "Rh", "kk", "kT", "kw", "km", "ky", "kr",
			"kl", "kx", "ks", "gN", "dn", "gn", "gw", "gm", "gy", "gr", "gl",
			"cc", "Kh", "Gh", "Ch", "Jh", "Ph", "Bh", "cr", "ND", "Dr", "Cr" };
	public String tchar[] = { "spr", "NTh", "Dhr", "NDh", "NDy", "Dhy", "NGc",
			"jjh", "jjw", "ghn", "ktr", "kTr", "nTr", "ngo", "sth", "sty",
			"stw", "skh", "sTr", "skr", "skl", "sph", "ShT", "Shk", "shl",
			"shr", "shy", "shm", "shw", "shn", "sht", "Shm", "Shw", "Shf",
			"Shp", "ShN", "rrg", "rrk", "Sch", "shc", "lbh", "ldh", "bdh",
			"phl", "mvr", "mbh", "mph", "mpr", "mth", "bhl", "bhr", "bhy",
			"ndh", "ndr", "ndw", "phr", "dbh", "ddh", "ddw", "ndy", "nth",
			"ntr", "nty", "ntw", "nTh", "dhr", "dhy", "dhm", "dhw", "dhn",
			"dgh", "thr", "thy", "thw", "tmy", "tth", "ttw", "NGj", "nch",
			"kkh", "kxw", "kxN", "kxm", "kxy", "khy", "khr", "gdh", "gny",
			"ghy", "ghr", "Ngk", "nk", "nky", "Ngg", "Ngm", "cch", "nDr",
			"NDr", "dvr", "chr", "gru", "grU", "lTr" };
	String qchar[] = { "hrri", "sthy", "Shkr", "Shph", "Shpr", "ShTh", "ShTr",
			"ShTy", "rrkhy", "rrky", "rrkh", "shch", "mbhr", "ndhr", "ndhy",
			"NGch", "kkhw", "kkhN", "kkhm", "kkhy", "Ngky", "Ngkx", "Ngkh",
			"Nggy", "Nggh", "cchw", "cchr", "dbhr" };
	String fchar[] = { "ShThy", "Ngkkh", "Ngghy", "Ngghr" };

	public phoneticBangla() {
		// Sorborner mapping
		srb = new HashMap<String, String>();

		srb.put("rri", "ঋ");
		srb.put("ee", "ঈ");
		srb.put("oo", "উ");
		srb.put("OI", "ঐ");
		srb.put("OU", "ঔ");
		srb.put("o", "অ");
		srb.put("i", "ই");
		srb.put("I", "ঈ");
		srb.put("u", "উ");
		srb.put("U", "ঊ");
		srb.put("e", "এ");
		srb.put("E", "এ");
		srb.put("O", "ও");
		srb.put("a", "আ");
		srb.put("A", "আ");

		// Sorborner mapping

		// kar mapping
		// Sorborner mapping
		kar = new HashMap<String, String>();

		kar.put("rri", "ৃ");
		kar.put("ee", "ী");
		kar.put("oo", "ু");
		kar.put("OI", "ৈ");
		kar.put("OU", "ৌ");
		kar.put("i", "ি");
		kar.put("I", "ী");
		kar.put("u", "ু");
		kar.put("U", "ূ");
		kar.put("e", "ে");
		kar.put("E", "ে");
		kar.put("O", "ো");
		kar.put("a", "া");
		kar.put("A", "া");
		// kar.put("oi","ই");

		// kar mapping

		// Sorborner mapping

		// Sorborner mapping

		// Banjonborner mapping
		bbr = new HashMap<String, String>();
		bbr.put("F", "ফ");
		bbr.put("SH", "ষ");
		bbr.put("V", "ভ");
		bbr.put("tT", "ৎ");
		bbr.put("0", "০");
		bbr.put("1", "১");
		bbr.put("2", "২");
		bbr.put("3", "৩");
		bbr.put("4", "৪");
		bbr.put("5", "৫");
		bbr.put("6", "৬");
		bbr.put("7", "৭");
		bbr.put("8", "৮");
		bbr.put("9", "৯");
		bbr.put("k", "ক");
		bbr.put("hh", "্");
		bbr.put("HH", "্");
		bbr.put("kh", "খ");
		bbr.put("Kh", "খ");
		bbr.put("g", "গ");
		bbr.put("gh", "ঘ");
		bbr.put("Gh", "ঘ");
		bbr.put("Ng", "ঙ");
		bbr.put("c", "চ");
		bbr.put("ch", "ছ");
		bbr.put("Ch", "ছ");
		bbr.put("j", "জ");
		bbr.put("jh", "ঝ");
		bbr.put("Jh", "ঝ");
		bbr.put("NG", "ঞ");
		bbr.put("T", "ট");
		bbr.put("Th", "ঠ");
		bbr.put("D", "ড");
		bbr.put("Dh", "ঢ");
		bbr.put("N", "ণ");
		bbr.put("t", "ত");
		bbr.put("th", "থ");
		bbr.put("d", "দ");
		bbr.put("dh", "ধ");
		bbr.put("n", "ন");
		bbr.put("p", "প");
		bbr.put("ph", "ফ");
		bbr.put("Ph", "ফ");
		bbr.put("f", "ফ");
		bbr.put("b", "ব");
		bbr.put("bh", "ভ");
		bbr.put("Bh", "ভ");
		bbr.put("v", "ভ");
		bbr.put("m", "ম");
		bbr.put("z", "য");
		bbr.put("r", "র");
		bbr.put("l", "ল");
		bbr.put("sh", "শ");
		bbr.put("S", "শ");
		bbr.put("Sh", "ষ");
		bbr.put("s", "স");
		bbr.put("h", "হ");
		bbr.put("R", "ড়");
		bbr.put("Rh", "ঢ়");
		bbr.put("y", "য়");
		bbr.put("Y", "য়");
		bbr.put("ng", "ং");
		bbr.put(":", "ঃ");
		bbr.put("q", "ক");
		bbr.put("Q", "ক");
		bbr.put("P", "প");
		bbr.put("G", "গ");
		bbr.put("H", "হ");
		bbr.put("J", "জ");
		bbr.put("K", "ক");
		bbr.put("L", "ল");
		bbr.put("C", "চ");
		bbr.put("B", "ব");
		bbr.put("M", "ম");
		bbr.put("Z", "্য");
	
		bbr.put("^", "ঁ");
		bbr.put("w", "ও");
		bbr.put("W", "ও");
		// jbr.put("W","্ব");

		// Banjonborner mapping

		// jukto mapping
		jbr = new HashMap<String, String>();
		
		jbr.put("spr", "স্প্র‌");
		jbr.put("rr", "র্");
		jbr.put("kk", "ক্ক");
		jbr.put("ngo", "ঙ্গ");
		jbr.put("kT", "ক্ট");
		jbr.put("kt", "ক্ত");
		jbr.put("ktr", "ক্ত্র");
		jbr.put("kTr", "ক্ট্র");
		jbr.put("kw", "ক্ব");
		jbr.put("km", "ক্ম");
		jbr.put("ky", "ক্য");
		jbr.put("kZ", "ক্য");
		jbr.put("kr", "ক্র");
		jbr.put("kl", "ক্ল");
		jbr.put("kkh", "ক্ষ");
		jbr.put("kx", "ক্ষ");
		jbr.put("kkhw", "ক্ষ্ব");
		jbr.put("kxw", "ক্ষ্ব");
		jbr.put("kkhN", "ক্ষ্ণ");
		jbr.put("kxN", "ক্ষ্ণ");
		jbr.put("kkhm", "ক্ষ্ম");
		jbr.put("kxm", "ক্ষ্ম");
		jbr.put("kkhy", "ক্ষ্য");
		jbr.put("kxy", "ক্ষ্য");
		jbr.put("kkhZ", "ক্ষ্য");
		jbr.put("kxZ", "ক্ষ্য");
		jbr.put("ks", "ক্স");
		jbr.put("khy", "খ্য");
		jbr.put("khZ", "খ্য");
		jbr.put("khr", "খ্র");
		jbr.put("gN", "গ্ণ");
		jbr.put("gdh", "গ্ধ");
		jbr.put("gn", "গ্ন");
		jbr.put("gny", "গ্ন্য");
		jbr.put("gnZ", "গ্ন্য");
		jbr.put("gw", "গ্ব");
		jbr.put("gm", "গ্ম");
		jbr.put("gy", "গ্য");
		jbr.put("gZ", "গ্য");
		jbr.put("gr", "গ্র");
		jbr.put("gl", "গ্ল");
		jbr.put("ghn", "ঘ্ন");
		jbr.put("ghy", "ঘ্য");
		jbr.put("ghZ", "ঘ্য");
		jbr.put("ghr", "ঘ্র");
		jbr.put("Ngk", "ঙ্ক");
		jbr.put("nk", "ঙ্ক");
		jbr.put("nky", "ঙ্ক্য");
		jbr.put("Ngky", "ঙ্ক্য");
		jbr.put("nkZ", "ঙ্ক্য");
		jbr.put("NgkZ", "ঙ্ক্য");
		jbr.put("Ngkkh", "ঙ্ক্ষ");
		jbr.put("Ngkx", "ঙ্ক্ষ");
		jbr.put("Ngkh", "ঙ্খ");
		jbr.put("Ngg", "ঙ্গ");
		jbr.put("Nggy", "ঙ্গ্য");
		jbr.put("NggZ", "ঙ্গ্য");
		jbr.put("Ngm", "ঙ্ম");
		jbr.put("Nggh", "ঙ্ঘ");
		jbr.put("Ngghy", "ঙ্ঘ্য");
		jbr.put("NgghZ", "ঙ্ঘ্য");
		jbr.put("Ngghr", "ঙ্ঘ্র");
		jbr.put("cc", "চ্চ");
		jbr.put("cch", "চ্ছ");
		jbr.put("cchw", "চ্ছ্ব");
		jbr.put("cchr", "চ্ছ্র");
		jbr.put("cNG", "চ্ঞ");
		jbr.put("cy", "চ্য");
		jbr.put("cZ", "চ্য");
		jbr.put("jj", "জ্জ");
		jbr.put("jjw", "জ্জ্ব");
		jbr.put("jjh", "জ্ঝ");
		jbr.put("gg", "জ্ঞ");
		jbr.put("jNG", "জ্ঞ");
		jbr.put("jw", "জ্ব");
		jbr.put("jy", "জ্য");
		jbr.put("jZ", "জ্য");
		jbr.put("jr", "জ্র");
		jbr.put("nc", "ঞ্চ");
		jbr.put("NGc", "ঞ্চ");
		jbr.put("Tw", "ট্ব");

		jbr.put("Tm", "ট্ম");
		jbr.put("Ty", "ট্য");
		jbr.put("TZ", "ট্য");
		jbr.put("Tr", "ট্র");
		jbr.put("DD", "ড্ড");
		jbr.put("Dy", "ড্য");
		jbr.put("Dz", "ড্য");
		jbr.put("Dr", "ড্র");
		jbr.put("Dhy", "ঢ্য");
		jbr.put("DhZ", "ঢ্য");
		jbr.put("Dhr", "ঢ্র");
		jbr.put("NT", "ণ্ট");
		jbr.put("NTh", "ণ্ঠ");
		jbr.put("ND", "ণ্ড");
		jbr.put("NDy", "ণ্ড্য");
		jbr.put("NDZ", "ণ্ড্য");
		jbr.put("NDr", "ণ্ড্র");
		jbr.put("NDh", "ণ্ঢ");
		jbr.put("nch", "ঞ্ছ");
		jbr.put("NGch", "ঞ্ছ");
		jbr.put("nj", "ঞ্জ");
		jbr.put("NGj", "ঞ্জ");
		jbr.put("TT", "ট্ট");
		jbr.put("tt", "ত্ত");
		jbr.put("ttw", "ত্ত্ব");
		jbr.put("tth", "ত্থ");
		jbr.put("tn", "ত্ন");
		jbr.put("tw", "ত্ব");
		jbr.put("tm", "ত্ম");

		jbr.put("tmy", "ত্ম্য");
		jbr.put("tmZ", "ত্ম্য");
		jbr.put("ty", "ত্য");
		jbr.put("tZ", "ত্য");
		jbr.put("tr", "ত্র");
		jbr.put("thw", "থ্ব");
		jbr.put("thy", "থ্য");
		jbr.put("thZ", "থ্য");
		jbr.put("thr", "থ্র");
		jbr.put("dg", "দ্গ");
		jbr.put("dgh", "দ্ঘ");
		jbr.put("dd", "দ্দ");
		jbr.put("Nn", "ণ্ন");
		jbr.put("Nw", "ণ্ব");
		jbr.put("Nm", "ণ্ম");
		jbr.put("Ny", "ণ্য");
		jbr.put("NZ", "ণ্য");
		jbr.put("dhn", "ধ্ন");
		jbr.put("dhw", "ধ্ব");
		jbr.put("dhm", "ধ্ম");
		jbr.put("dhy", "ধ্য");
		jbr.put("dhZ", "ধ্য");
		jbr.put("dhr", "ধ্র");
		jbr.put("nT", "ন্ট");
		jbr.put("nTr", "ন্ট্র");
		jbr.put("nTh", "ন্ঠ");
		jbr.put("nD", "ন্ড");
		jbr.put("nt", "ন্ত");
		jbr.put("ntw", "ন্ত্ব");
		jbr.put("nty", "ন্ত্য");
		jbr.put("ntZ", "ন্ত্য");
		jbr.put("ntr", "ন্ত্র");
		jbr.put("nth", "ন্থ");
		jbr.put("nd", "ন্দ");
		jbr.put("ndy", "ন্দ্য");
		jbr.put("ndZ", "ন্দ্য");
		jbr.put("ddw", "দ্দ্ব");
		jbr.put("ddh", "দ্ধ");
		jbr.put("dw", "দ্ব");
		jbr.put("dv", "দ্ভ");
		jbr.put("dbh", "দ্ভ");
		jbr.put("dm", "দ্ম");
		jbr.put("dy", "দ্য");
		jbr.put("dZ", "দ্য");
		jbr.put("dr", "দ্র");
		jbr.put("nm", "ন্ম");
		jbr.put("ny", "ন্য");
		jbr.put("nZ", "ন্য");
		jbr.put("ns", "ন্স");
		jbr.put("pT", "প্ট");
		jbr.put("pt", "প্ত");
		jbr.put("pn", "প্ন");
		jbr.put("pp", "প্প");
		jbr.put("py", "প্য");
		jbr.put("pZ", "প্য");
		jbr.put("pr", "প্র");
		jbr.put("pl", "প্ল");
		jbr.put("ps", "প্স");
		jbr.put("fr", "ফ্র");
		jbr.put("phr", "ফ্র");
		jbr.put("ndw", "ন্দ্ব");
		jbr.put("ndr", "ন্দ্র");
		jbr.put("ndh", "ন্ধ");
		jbr.put("ndhy", "ন্ধ্য");
		jbr.put("ndhZ", "ন্ধ্য");
		jbr.put("ndhr", "ন্ধ্র");
		jbr.put("nn", "ন্ন");
		jbr.put("nw", "ন্ব");
		jbr.put("vy", "ভ্য");
		jbr.put("vZ", "ভ্য");
		jbr.put("bhy", "ভ্য");
		jbr.put("bhZ", "ভ্য");
		jbr.put("vr", "ভ্র");
		jbr.put("bhr", "ভ্র");
		jbr.put("vl", "ভ্ল");
		jbr.put("bhl", "ভ্ল");
		jbr.put("mth", "ম্থ");
		jbr.put("mn", "ম্ন");
		jbr.put("mp", "ম্প");
		jbr.put("mpr", "ম্প্র");
		jbr.put("mf", "ম্ফ");
		jbr.put("mph", "ম্ফ");
		jbr.put("mb", "ম্ব");
		jbr.put("mw", "ম্ব");
		jbr.put("mv", "ম্ভ");
		jbr.put("mbh", "ম্ভ");
		jbr.put("mvr", "ম্ভ্র");
		jbr.put("mbhr", "ম্ভ্র");
		jbr.put("mm", "ম্ম");
		jbr.put("my", "ম্য");
		jbr.put("mZ", "ম্য");
		jbr.put("mr", "ম্র");
		jbr.put("fl", "ফ্ল");
		jbr.put("phl", "ফ্ল");
		jbr.put("bj", "ব্জ");
		jbr.put("bd", "ব্দ");
		jbr.put("bdh", "ব্ধ");
		jbr.put("bb", "ব্ব");
		jbr.put("by", "ব্য");
		jbr.put("bZ", "ব্য");
		jbr.put("rZ", "র‍্য");
		jbr.put("br", "ব্র");
		jbr.put("bl", "ব্ল");
		jbr.put("lT", "ল্ট");
		jbr.put("lD", "ল্ড");
		jbr.put("ldh", "ল্ধ");
		jbr.put("lp", "ল্প");
		jbr.put("lb", "ল্ব");
		jbr.put("lw", "ল্ব");
		jbr.put("lv", "ল্ভ");
		jbr.put("lbh", "ল্ভ");
		jbr.put("lm", "ল্ম");
		jbr.put("ly", "ল্য");
		jbr.put("lZ", "ল্য");
		jbr.put("ll", "ল্ল");
		jbr.put("shc", "শ্চ");
		jbr.put("Sc", "শ্চ");
		jbr.put("shch", "শ্ছ");
		jbr.put("Sch", "শ্ছ");
		jbr.put("ml", "ম্ল");
		jbr.put("zy", "য্য");
		jbr.put("zZ", "য্য");
		jbr.put("rrk", "র্ক");
		jbr.put("rrkh", "র্খ");
		jbr.put("rrg", "র্গ");
		jbr.put("rrky", "র্ক্য");
		jbr.put("rrkZ", "র্ক্য");
		jbr.put("rrkhy", "র্খ্য");
		jbr.put("rrkhZ", "র্খ্য");
		jbr.put("lk", "ল্ক");
		jbr.put("lg", "ল্গ");
		jbr.put("ShTy", "ষ্ট্য");
		jbr.put("ShTZ", "ষ্ট্য");
		jbr.put("ShTr", "ষ্ট্র");
		jbr.put("ShTh", "ষ্ঠ");
		jbr.put("ShThy", "ষ্ঠ্য");
		jbr.put("ShThZ", "ষ্ঠ্য");
		jbr.put("ShN", "ষ্ণ");
		jbr.put("Shp", "ষ্প");
		jbr.put("Shpr", "ষ্প্র");
		jbr.put("Shph", "ষ্ফ");
		jbr.put("Shf", "ষ্ফ");
		jbr.put("Shw", "ষ্ব");
		jbr.put("Shm", "ষ্ম");
		jbr.put("sk", "স্ক");
		jbr.put("sht", "শ্ত");
		jbr.put("St", "শ্ত");
		jbr.put("shn", "শ্ন");
		jbr.put("Sn", "শ্ন");
		jbr.put("shw", "শ্ব");
		jbr.put("Sw", "শ্ব");
		jbr.put("shm", "শ্ম");
		jbr.put("Sm", "শ্ম");
		jbr.put("shy", "শ্য");
		jbr.put("shZ", "শ্য");
		jbr.put("Sy", "শ্য");
		jbr.put("SZ", "শ্য");
		jbr.put("shr", "শ্র");
		jbr.put("Sr", "শ্র");
		jbr.put("shl", "শ্ল");
		jbr.put("Sl", "শ্ল");
		jbr.put("Shk", "ষ্ক");
		jbr.put("Shkr", "ষ্ক্র");
		jbr.put("ShT", "ষ্ট");
		jbr.put("sf", "স্ফ");
		jbr.put("sph", "স্ফ");
		jbr.put("sw", "স্ব");
		jbr.put("sm", "স্ম");
		jbr.put("sy", "স্য");
		jbr.put("sZ", "স্য");
		jbr.put("sr", "স্র");
		jbr.put("sl", "স্ল");
		jbr.put("skl", "স্ক্ল");
		jbr.put("hN", "হ্ণ");
		jbr.put("hn", "হ্ন");
		jbr.put("skr", "স্ক্র");
		jbr.put("sT", "স্ট");
		jbr.put("sTr", "স্ট্র");
		jbr.put("skh", "স্খ");
		jbr.put("st", "স্ত");
		jbr.put("stw", "স্ত্ব");
		jbr.put("sty", "স্ত্য");
		jbr.put("stZ", "স্ত্য");
		jbr.put("sth", "স্থ");
		jbr.put("sthy", "স্থ্য");
		jbr.put("sthZ", "স্থ্য");
		jbr.put("sn", "স্ন");
		jbr.put("sp", "স্প");
		jbr.put("hw", "হ্ব");
		jbr.put("hm", "হ্ম");
		jbr.put("hy", "হ্য");
		jbr.put("hZ", "হ্য");
		jbr.put("hr", "হ্র");
		jbr.put("hl", "হ্ল");
		jbr.put("hrri", "হৃ");
		jbr.put("gru", "গ্রু");
		jbr.put("grU", "গ্রূ");
		jbr.put("lTr", "ল্ট্র");
		jbr.put("cr", "চ্র");
		jbr.put("Cr", "চ্র");
		jbr.put("nDr","ন্ড্র");
		jbr.put("dvr","দ্ভ্র");
		jbr.put("chr","ছ্র");
		jbr.put("dbhr","দ্ভ্র");
	
	}
	
	public StringBuilder phonetic(StringBuilder s) {
		String tmp = s.toString().replace("A", "a");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("B", "b");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("B", "b");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("C", "c");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("E", "e");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("F", "f");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("G", "g");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("H", "h");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("J", "j");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("K", "k");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("L", "l");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("M", "m");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("P", "p");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("Q", "q");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("V", "v");
		s= new StringBuilder(tmp);
		tmp = s.toString().replace("Y", "y");
		s= new StringBuilder(tmp);
		
		
		StringBuilder ps = new StringBuilder();
		ps = s;
		//x
		ps = chng3(s.toString(), "x");
		s = ps;
		ps = chng3(s.toString(), "X");
		s = ps;
		
		//x
		// 5 char er gulan
		for (int i = 0; i < fchar.length; i++) {
			ps = chng(s.toString(), fchar[i], jbr.get(fchar[i]));
			s = ps;
		}
		// 5 char er gulan

		// 4 char er gulan
		for (int i = 0; i < qchar.length; i++) {
			ps = chng(s.toString(), qchar[i], jbr.get(qchar[i]));
			s = ps;
		}
		// 4 char er gulan

		// 3char er gulan
		for (int i = 0; i < tchar.length; i++) {
			ps = chng(s.toString(), tchar[i], jbr.get(tchar[i]));
			s = ps;
		}

		ps = chng2(s.toString(), "rri");
		s = ps;
		// 3char er gulan

		// 2char er gulan
		for (int i = 0; i < dchar.length; i++) {
			if (srb.containsKey(dchar[i])) {
				ps = chng2(s.toString(), dchar[i]);
				s = ps;
			} else if (bbr.containsKey(dchar[i])) {
				ps = chng(s.toString(), dchar[i], bbr.get(dchar[i]));
				s = ps;
			} else if (jbr.containsKey(dchar[i])) {
				ps = chng(s.toString(), dchar[i], jbr.get(dchar[i]));
				s = ps;
			}

		}
		// 2char er gulan

		// single char
		for (int i = 0; i < schar.length; i++) {

			if (srb.containsKey(schar[i])) {
				ps = chng2(s.toString(), schar[i]);
				s = ps;
			} else if (bbr.containsKey(schar[i])) {
				ps = chng(s.toString(), schar[i], bbr.get(schar[i]));
				s = ps;
			}
		}
		// single char


		
		// o re replace krtesi
		ps = chng(s.toString(), "o", "");

		//

		return ps;

	}
	public StringBuilder chng(String txt, String ch, String nch) {		
		 String temp = txt.replace(ch, nch);
		 StringBuilder sx = new StringBuilder(temp);
		return sx;
	}


	public StringBuilder chng3(String txt, String ch) {
String s;
		StringBuilder sx = new StringBuilder();

for(int i=0;i<txt.length();i++)
{
	if(i==0)
	{
	if((""+txt.charAt(i)).compareToIgnoreCase("x")==0)
	{
		sx.append("এক্স");
	}
	else
		sx.append(txt.charAt(i));
	}
	else
	{
		if((""+txt.charAt(i)).compareToIgnoreCase("x")==0 )
		{
			if(isAlphabet(txt.charAt(i-1)))
			sx.append("ক্স");
			else
				sx.append("এক্স");
		}
		else
			sx.append(txt.charAt(i));
		}
	}
return sx;
	}
	
	
	public StringBuilder chng2(String txt, String ch) {

		StringBuilder sx = new StringBuilder();
		sx.append(txt);
		if(ch.compareToIgnoreCase("a") == 0)
		{StringBuilder asx= new StringBuilder();
			for(int i=0;i<txt.length();i++)
			{
				if(i==0)
				{
				if((""+txt.charAt(i)).compareToIgnoreCase("a")==0)
				{
					asx.append("আ");
				}
				else
					asx.append(txt.charAt(i));
				}
				else
				{
					if((""+txt.charAt(i)).compareToIgnoreCase("a")==0 && (srb.containsValue("" + txt.charAt(i - 1)) || srb.containsKey("" + txt.charAt(i - 1))
							|| kar.containsKey("" + txt.charAt(i - 1)) || kar
							.containsValue("" + txt.charAt(i - 1))))
					{
						if (("" + txt.charAt(i - 1)).compareTo("আ") == 0 || ("" + txt
								.charAt(i - 1)).compareTo("া") == 0|| ("" + txt
										.charAt(i - 1)).compareTo("a") == 0 || ("" + txt
												.charAt(i - 1)).compareTo("A") == 0)
							asx.append("আ");
						else
						asx.append("য়া");
					}
					else if((""+txt.charAt(i)).compareToIgnoreCase("a")==0 && (bbr.containsValue("" + txt.charAt(i - 1)) || bbr.containsKey("" + txt.charAt(i - 1))
							|| jbr.containsKey("" + txt.charAt(i - 1)) || jbr
							.containsValue("" + txt.charAt(i - 1))))
						asx.append("া");
					else
						asx.append(txt.charAt(i));
					}
			}
			return asx;
		}
		else
		{
		int ofe = sx.indexOf(ch, 0);

		for (int ofs = 0; ofs < txt.length() && ofe != -1; ofs = ofe + 1) {
			ofe = sx.indexOf(ch, ofs);
			if (ofe == -1)
				break;
			else {
				if (ofe == 0)
					sx.replace(ofe, ofe +ch.length(), srb.get(ch));
				else {
					
					if (ch.compareTo("o") == 0
							&& (srb.containsValue("" + txt.charAt(ofe - 1))
									|| srb.containsKey("" + txt.charAt(ofe - 1))
									|| kar.containsKey("" + txt.charAt(ofe - 1)) || kar
										.containsValue("" + txt.charAt(ofe - 1)))) {
				
						sx.replace(ofe, ofe + 1, "ও");
					}else if (srb.containsKey("" + txt.charAt(ofe - 1))
							|| srb.containsValue("" + txt.charAt(ofe - 1))
							|| kar.containsKey("" + txt.charAt(ofe - 1))
							|| kar.containsValue("" + txt.charAt(ofe - 1))
							|| ("" + txt.charAt(ofe - 1)).compareTo("o") == 0) {

						sx.replace(ofe, ofe + ch.length(), srb.get(ch));
					}

					else {
						if (("" + txt.charAt(ofe)).compareTo("o") != 0) {
							sx.replace(ofe, ofe + ch.length(), kar.get(ch));

						}

					}
				}
			}

		}
	}
		return sx;
	}
	
	private boolean isAlphabet(int code) {
		if (Character.isLetter(code)) {
			return true;
		} else {
			return false;
		}
	}

}
