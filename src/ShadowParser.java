// Generated from ./Shadow.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShadowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STALA=1, ZMIENNA=2, ALBO=3, DLA=4, JESLI=5, IDZ=6, ZWROC=7, DOPOKI=8, 
		FUNKCJA=9, BOOLEAN=10, NIC=11, LNAWIAS=12, PNAWIAS=13, LKLAMROWY=14, PKLAMROWY=15, 
		LKWADRAT=16, PKWADRAT=17, CUDZYSLOW=18, SREDNIK=19, PRZECINEK=20, KROPKA=21, 
		PRZYPISANIE=22, WIEKSZE=23, MNIEJSZE=24, WYKRZYKNIK=25, PYTAJNIK=26, DWUKROPEK=27, 
		POROWNANIE=28, NIEROWNE=29, I=30, LUB=31, ZWIEKSZENIE=32, ZMNIEJSZENIE=33, 
		PLUS=34, MINUS=35, MNOZENIE=36, DZIELENIE=37, POTEGOWANIE=38, BITI=39, 
		BITLUB=40, MODULO=41, STRZALKA=42, PODWOJNYDWUKROPEK=43, ZNAKI=44, LICZBY=45, 
		BIALE_ZNAKI=46, KOMENTARZ=47, LINIA_KOMENTARZA=48;
	public static final int
		RULE_program = 0, RULE_komunikat = 1, RULE_utworzenie_stalej = 2, RULE_utworzenie_zmiennej = 3, 
		RULE_zmiana_zmiennej = 4, RULE_wyrazenie = 5, RULE_zapytanie_jesli = 6, 
		RULE_petla_dopoki = 7, RULE_petla_dla = 8, RULE_deklaracja_funkcji = 9, 
		RULE_wywolanie_funkcji = 10, RULE_lewynaw = 11, RULE_prawynaw = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "komunikat", "utworzenie_stalej", "utworzenie_zmiennej", "zmiana_zmiennej", 
			"wyrazenie", "zapytanie_jesli", "petla_dopoki", "petla_dla", "deklaracja_funkcji", 
			"wywolanie_funkcji", "lewynaw", "prawynaw"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stala'", "'zmienna'", "'albo'", "'dla'", "'jesli'", "'idz'", 
			"'zwroc'", "'dopoki'", "'funkcja'", null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'\"'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
			"'!'", "'?'", "':'", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'&'", "'|'", "'%'", "'->'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STALA", "ZMIENNA", "ALBO", "DLA", "JESLI", "IDZ", "ZWROC", "DOPOKI", 
			"FUNKCJA", "BOOLEAN", "NIC", "LNAWIAS", "PNAWIAS", "LKLAMROWY", "PKLAMROWY", 
			"LKWADRAT", "PKWADRAT", "CUDZYSLOW", "SREDNIK", "PRZECINEK", "KROPKA", 
			"PRZYPISANIE", "WIEKSZE", "MNIEJSZE", "WYKRZYKNIK", "PYTAJNIK", "DWUKROPEK", 
			"POROWNANIE", "NIEROWNE", "I", "LUB", "ZWIEKSZENIE", "ZMNIEJSZENIE", 
			"PLUS", "MINUS", "MNOZENIE", "DZIELENIE", "POTEGOWANIE", "BITI", "BITLUB", 
			"MODULO", "STRZALKA", "PODWOJNYDWUKROPEK", "ZNAKI", "LICZBY", "BIALE_ZNAKI", 
			"KOMENTARZ", "LINIA_KOMENTARZA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Shadow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShadowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<KomunikatContext> komunikat() {
			return getRuleContexts(KomunikatContext.class);
		}
		public KomunikatContext komunikat(int i) {
			return getRuleContext(KomunikatContext.class,i);
		}
		public List<TerminalNode> SREDNIK() { return getTokens(ShadowParser.SREDNIK); }
		public TerminalNode SREDNIK(int i) {
			return getToken(ShadowParser.SREDNIK, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STALA) | (1L << ZMIENNA) | (1L << DLA) | (1L << JESLI) | (1L << DOPOKI) | (1L << FUNKCJA) | (1L << LNAWIAS) | (1L << ZNAKI))) != 0)) {
				{
				{
				setState(26);
				komunikat();
				setState(27);
				match(SREDNIK);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KomunikatContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public Utworzenie_stalejContext utworzenie_stalej() {
			return getRuleContext(Utworzenie_stalejContext.class,0);
		}
		public Utworzenie_zmiennejContext utworzenie_zmiennej() {
			return getRuleContext(Utworzenie_zmiennejContext.class,0);
		}
		public Zmiana_zmiennejContext zmiana_zmiennej() {
			return getRuleContext(Zmiana_zmiennejContext.class,0);
		}
		public Zapytanie_jesliContext zapytanie_jesli() {
			return getRuleContext(Zapytanie_jesliContext.class,0);
		}
		public Petla_dopokiContext petla_dopoki() {
			return getRuleContext(Petla_dopokiContext.class,0);
		}
		public Petla_dlaContext petla_dla() {
			return getRuleContext(Petla_dlaContext.class,0);
		}
		public Deklaracja_funkcjiContext deklaracja_funkcji() {
			return getRuleContext(Deklaracja_funkcjiContext.class,0);
		}
		public Wywolanie_funkcjiContext wywolanie_funkcji() {
			return getRuleContext(Wywolanie_funkcjiContext.class,0);
		}
		public KomunikatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_komunikat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterKomunikat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitKomunikat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitKomunikat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KomunikatContext komunikat() throws RecognitionException {
		KomunikatContext _localctx = new KomunikatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_komunikat);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				wyrazenie(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				utworzenie_stalej();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				utworzenie_zmiennej();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				zmiana_zmiennej();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				zapytanie_jesli();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				petla_dopoki();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				petla_dla();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(41);
				deklaracja_funkcji();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(42);
				wywolanie_funkcji();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Utworzenie_stalejContext extends ParserRuleContext {
		public Utworzenie_stalejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utworzenie_stalej; }
	 
		public Utworzenie_stalejContext() { }
		public void copyFrom(Utworzenie_stalejContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UtworzeniestalejContext extends Utworzenie_stalejContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode STALA() { return getToken(ShadowParser.STALA, 0); }
		public TerminalNode PRZYPISANIE() { return getToken(ShadowParser.PRZYPISANIE, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public UtworzeniestalejContext(Utworzenie_stalejContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterUtworzeniestalej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitUtworzeniestalej(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitUtworzeniestalej(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Utworzenie_stalejContext utworzenie_stalej() throws RecognitionException {
		Utworzenie_stalejContext _localctx = new Utworzenie_stalejContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_utworzenie_stalej);
		try {
			_localctx = new UtworzeniestalejContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(STALA);
			setState(46);
			((UtworzeniestalejContext)_localctx).lewa = wyrazenie(0);
			setState(47);
			match(PRZYPISANIE);
			setState(48);
			((UtworzeniestalejContext)_localctx).prawa = wyrazenie(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Utworzenie_zmiennejContext extends ParserRuleContext {
		public Utworzenie_zmiennejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utworzenie_zmiennej; }
	 
		public Utworzenie_zmiennejContext() { }
		public void copyFrom(Utworzenie_zmiennejContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UtworzeniezmiennejContext extends Utworzenie_zmiennejContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode ZMIENNA() { return getToken(ShadowParser.ZMIENNA, 0); }
		public TerminalNode PRZYPISANIE() { return getToken(ShadowParser.PRZYPISANIE, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public UtworzeniezmiennejContext(Utworzenie_zmiennejContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterUtworzeniezmiennej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitUtworzeniezmiennej(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitUtworzeniezmiennej(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Utworzenie_zmiennejContext utworzenie_zmiennej() throws RecognitionException {
		Utworzenie_zmiennejContext _localctx = new Utworzenie_zmiennejContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_utworzenie_zmiennej);
		try {
			_localctx = new UtworzeniezmiennejContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ZMIENNA);
			setState(51);
			((UtworzeniezmiennejContext)_localctx).lewa = wyrazenie(0);
			setState(52);
			match(PRZYPISANIE);
			setState(53);
			((UtworzeniezmiennejContext)_localctx).prawa = wyrazenie(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zmiana_zmiennejContext extends ParserRuleContext {
		public Zmiana_zmiennejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zmiana_zmiennej; }
	 
		public Zmiana_zmiennejContext() { }
		public void copyFrom(Zmiana_zmiennejContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZmianazmiennejContext extends Zmiana_zmiennejContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode PRZYPISANIE() { return getToken(ShadowParser.PRZYPISANIE, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public ZmianazmiennejContext(Zmiana_zmiennejContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterZmianazmiennej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitZmianazmiennej(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitZmianazmiennej(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zmiana_zmiennejContext zmiana_zmiennej() throws RecognitionException {
		Zmiana_zmiennejContext _localctx = new Zmiana_zmiennejContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_zmiana_zmiennej);
		try {
			_localctx = new ZmianazmiennejContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((ZmianazmiennejContext)_localctx).lewa = wyrazenie(0);
			setState(56);
			match(PRZYPISANIE);
			setState(57);
			((ZmianazmiennejContext)_localctx).prawa = wyrazenie(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WyrazenieContext extends ParserRuleContext {
		public WyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenie; }
	 
		public WyrazenieContext() { }
		public void copyFrom(WyrazenieContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WyrazeniezwiekszenieContext extends WyrazenieContext {
		public WyrazenieContext lewa;
		public TerminalNode ZWIEKSZENIE() { return getToken(ShadowParser.ZWIEKSZENIE, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazeniezwiekszenieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazeniezwiekszenie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazeniezwiekszenie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitWyrazeniezwiekszenie(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazeniezmniejszenieContext extends WyrazenieContext {
		public WyrazenieContext lewa;
		public TerminalNode ZMNIEJSZENIE() { return getToken(ShadowParser.ZMNIEJSZENIE, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazeniezmniejszenieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazeniezmniejszenie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazeniezmniejszenie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitWyrazeniezmniejszenie(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazeniepotegowaniaContext extends WyrazenieContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode POTEGOWANIE() { return getToken(ShadowParser.POTEGOWANIE, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniepotegowaniaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazeniepotegowania(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazeniepotegowania(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitWyrazeniepotegowania(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazeniedzieleniaContext extends WyrazenieContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode DZIELENIE() { return getToken(ShadowParser.DZIELENIE, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniedzieleniaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazeniedzielenia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazeniedzielenia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitWyrazeniedzielenia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazeniefunkcjaContext extends WyrazenieContext {
		public Wywolanie_funkcjiContext wywolanie_funkcji() {
			return getRuleContext(Wywolanie_funkcjiContext.class,0);
		}
		public WyrazeniefunkcjaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazeniefunkcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazeniefunkcja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitWyrazeniefunkcja(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazeniedodawaniaContext extends WyrazenieContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode PLUS() { return getToken(ShadowParser.PLUS, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniedodawaniaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazeniedodawania(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazeniedodawania(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitWyrazeniedodawania(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenienawiasContext extends WyrazenieContext {
		public LewynawContext lewynaw() {
			return getRuleContext(LewynawContext.class,0);
		}
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public PrawynawContext prawynaw() {
			return getRuleContext(PrawynawContext.class,0);
		}
		public WyrazenienawiasContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazenienawias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazenienawias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitWyrazenienawias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazeniemnozeniaContext extends WyrazenieContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode MNOZENIE() { return getToken(ShadowParser.MNOZENIE, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniemnozeniaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazeniemnozenia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazeniemnozenia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitWyrazeniemnozenia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieznakoweContext extends WyrazenieContext {
		public TerminalNode ZNAKI() { return getToken(ShadowParser.ZNAKI, 0); }
		public WyrazenieznakoweContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazenieznakowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazenieznakowe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitWyrazenieznakowe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieodejmowaniaContext extends WyrazenieContext {
		public WyrazenieContext lewa;
		public WyrazenieContext prawa;
		public TerminalNode MINUS() { return getToken(ShadowParser.MINUS, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazenieodejmowaniaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWyrazenieodejmowania(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWyrazenieodejmowania(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitWyrazenieodejmowania(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WyrazenieContext wyrazenie() throws RecognitionException {
		return wyrazenie(0);
	}

	private WyrazenieContext wyrazenie(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WyrazenieContext _localctx = new WyrazenieContext(_ctx, _parentState);
		WyrazenieContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_wyrazenie, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LNAWIAS:
				{
				_localctx = new WyrazenienawiasContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(60);
				lewynaw();
				setState(61);
				wyrazenie(0);
				setState(62);
				prawynaw();
				}
				break;
			case FUNKCJA:
				{
				_localctx = new WyrazeniefunkcjaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				wywolanie_funkcji();
				}
				break;
			case ZNAKI:
				{
				_localctx = new WyrazenieznakoweContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(ZNAKI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazeniedodawaniaContext(new WyrazenieContext(_parentctx, _parentState));
						((WyrazeniedodawaniaContext)_localctx).lewa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(68);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(69);
						match(PLUS);
						setState(70);
						((WyrazeniedodawaniaContext)_localctx).prawa = wyrazenie(11);
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieodejmowaniaContext(new WyrazenieContext(_parentctx, _parentState));
						((WyrazenieodejmowaniaContext)_localctx).lewa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(71);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(72);
						match(MINUS);
						setState(73);
						((WyrazenieodejmowaniaContext)_localctx).prawa = wyrazenie(10);
						}
						break;
					case 3:
						{
						_localctx = new WyrazeniemnozeniaContext(new WyrazenieContext(_parentctx, _parentState));
						((WyrazeniemnozeniaContext)_localctx).lewa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(74);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(75);
						match(MNOZENIE);
						setState(76);
						((WyrazeniemnozeniaContext)_localctx).prawa = wyrazenie(9);
						}
						break;
					case 4:
						{
						_localctx = new WyrazeniedzieleniaContext(new WyrazenieContext(_parentctx, _parentState));
						((WyrazeniedzieleniaContext)_localctx).lewa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(77);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(78);
						match(DZIELENIE);
						setState(79);
						((WyrazeniedzieleniaContext)_localctx).prawa = wyrazenie(8);
						}
						break;
					case 5:
						{
						_localctx = new WyrazeniepotegowaniaContext(new WyrazenieContext(_parentctx, _parentState));
						((WyrazeniepotegowaniaContext)_localctx).lewa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(80);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(81);
						match(POTEGOWANIE);
						setState(82);
						((WyrazeniepotegowaniaContext)_localctx).prawa = wyrazenie(7);
						}
						break;
					case 6:
						{
						_localctx = new WyrazeniezwiekszenieContext(new WyrazenieContext(_parentctx, _parentState));
						((WyrazeniezwiekszenieContext)_localctx).lewa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(83);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(84);
						match(ZWIEKSZENIE);
						}
						break;
					case 7:
						{
						_localctx = new WyrazeniezmniejszenieContext(new WyrazenieContext(_parentctx, _parentState));
						((WyrazeniezmniejszenieContext)_localctx).lewa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(85);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(86);
						match(ZMNIEJSZENIE);
						}
						break;
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Zapytanie_jesliContext extends ParserRuleContext {
		public TerminalNode JESLI() { return getToken(ShadowParser.JESLI, 0); }
		public Zapytanie_jesliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zapytanie_jesli; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterZapytanie_jesli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitZapytanie_jesli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitZapytanie_jesli(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zapytanie_jesliContext zapytanie_jesli() throws RecognitionException {
		Zapytanie_jesliContext _localctx = new Zapytanie_jesliContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_zapytanie_jesli);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(JESLI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Petla_dopokiContext extends ParserRuleContext {
		public TerminalNode DOPOKI() { return getToken(ShadowParser.DOPOKI, 0); }
		public Petla_dopokiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_petla_dopoki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterPetla_dopoki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitPetla_dopoki(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitPetla_dopoki(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Petla_dopokiContext petla_dopoki() throws RecognitionException {
		Petla_dopokiContext _localctx = new Petla_dopokiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_petla_dopoki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(DOPOKI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Petla_dlaContext extends ParserRuleContext {
		public TerminalNode DLA() { return getToken(ShadowParser.DLA, 0); }
		public Petla_dlaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_petla_dla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterPetla_dla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitPetla_dla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitPetla_dla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Petla_dlaContext petla_dla() throws RecognitionException {
		Petla_dlaContext _localctx = new Petla_dlaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_petla_dla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(DLA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deklaracja_funkcjiContext extends ParserRuleContext {
		public TerminalNode FUNKCJA() { return getToken(ShadowParser.FUNKCJA, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public TerminalNode PRZYPISANIE() { return getToken(ShadowParser.PRZYPISANIE, 0); }
		public TerminalNode LNAWIAS() { return getToken(ShadowParser.LNAWIAS, 0); }
		public TerminalNode PNAWIAS() { return getToken(ShadowParser.PNAWIAS, 0); }
		public List<KomunikatContext> komunikat() {
			return getRuleContexts(KomunikatContext.class);
		}
		public KomunikatContext komunikat(int i) {
			return getRuleContext(KomunikatContext.class,i);
		}
		public Deklaracja_funkcjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracja_funkcji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterDeklaracja_funkcji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitDeklaracja_funkcji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitDeklaracja_funkcji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklaracja_funkcjiContext deklaracja_funkcji() throws RecognitionException {
		Deklaracja_funkcjiContext _localctx = new Deklaracja_funkcjiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_deklaracja_funkcji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(FUNKCJA);
			setState(99);
			wyrazenie(0);
			setState(100);
			match(PRZYPISANIE);
			setState(101);
			match(LNAWIAS);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STALA) | (1L << ZMIENNA) | (1L << DLA) | (1L << JESLI) | (1L << DOPOKI) | (1L << FUNKCJA) | (1L << LNAWIAS) | (1L << ZNAKI))) != 0)) {
				{
				{
				setState(102);
				komunikat();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(PNAWIAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wywolanie_funkcjiContext extends ParserRuleContext {
		public TerminalNode FUNKCJA() { return getToken(ShadowParser.FUNKCJA, 0); }
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public TerminalNode LNAWIAS() { return getToken(ShadowParser.LNAWIAS, 0); }
		public TerminalNode PNAWIAS() { return getToken(ShadowParser.PNAWIAS, 0); }
		public Wywolanie_funkcjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wywolanie_funkcji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterWywolanie_funkcji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitWywolanie_funkcji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitWywolanie_funkcji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wywolanie_funkcjiContext wywolanie_funkcji() throws RecognitionException {
		Wywolanie_funkcjiContext _localctx = new Wywolanie_funkcjiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_wywolanie_funkcji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FUNKCJA);
			setState(111);
			wyrazenie(0);
			setState(112);
			match(LNAWIAS);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNKCJA) | (1L << LNAWIAS) | (1L << ZNAKI))) != 0)) {
				{
				{
				setState(113);
				wyrazenie(0);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(PNAWIAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LewynawContext extends ParserRuleContext {
		public TerminalNode LNAWIAS() { return getToken(ShadowParser.LNAWIAS, 0); }
		public TerminalNode LKWADRAT() { return getToken(ShadowParser.LKWADRAT, 0); }
		public TerminalNode LKLAMROWY() { return getToken(ShadowParser.LKLAMROWY, 0); }
		public LewynawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lewynaw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterLewynaw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitLewynaw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitLewynaw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LewynawContext lewynaw() throws RecognitionException {
		LewynawContext _localctx = new LewynawContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lewynaw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LNAWIAS);
			setState(122);
			match(LKWADRAT);
			setState(123);
			match(LKLAMROWY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrawynawContext extends ParserRuleContext {
		public TerminalNode PNAWIAS() { return getToken(ShadowParser.PNAWIAS, 0); }
		public TerminalNode PKLAMROWY() { return getToken(ShadowParser.PKLAMROWY, 0); }
		public TerminalNode PKWADRAT() { return getToken(ShadowParser.PKWADRAT, 0); }
		public PrawynawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prawynaw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).enterPrawynaw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShadowListener ) ((ShadowListener)listener).exitPrawynaw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShadowVisitor ) return ((ShadowVisitor<? extends T>)visitor).visitPrawynaw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrawynawContext prawynaw() throws RecognitionException {
		PrawynawContext _localctx = new PrawynawContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prawynaw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(PNAWIAS);
			setState(126);
			match(PKLAMROWY);
			setState(127);
			match(PKWADRAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return wyrazenie_sempred((WyrazenieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean wyrazenie_sempred(WyrazenieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7E\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fu\n"+
		"\f\f\f\16\fx\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\2\3"+
		"\f\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u008a\2!\3\2\2\2\4-\3\2\2"+
		"\2\6/\3\2\2\2\b\64\3\2\2\2\n9\3\2\2\2\fD\3\2\2\2\16^\3\2\2\2\20`\3\2\2"+
		"\2\22b\3\2\2\2\24d\3\2\2\2\26p\3\2\2\2\30{\3\2\2\2\32\177\3\2\2\2\34\35"+
		"\5\4\3\2\35\36\7\25\2\2\36 \3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2"+
		"\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2\2$.\5\f\7\2%.\5\6\4\2&.\5\b\5\2\'.\5"+
		"\n\6\2(.\5\16\b\2).\5\20\t\2*.\5\22\n\2+.\5\24\13\2,.\5\26\f\2-$\3\2\2"+
		"\2-%\3\2\2\2-&\3\2\2\2-\'\3\2\2\2-(\3\2\2\2-)\3\2\2\2-*\3\2\2\2-+\3\2"+
		"\2\2-,\3\2\2\2.\5\3\2\2\2/\60\7\3\2\2\60\61\5\f\7\2\61\62\7\30\2\2\62"+
		"\63\5\f\7\2\63\7\3\2\2\2\64\65\7\4\2\2\65\66\5\f\7\2\66\67\7\30\2\2\67"+
		"8\5\f\7\28\t\3\2\2\29:\5\f\7\2:;\7\30\2\2;<\5\f\7\2<\13\3\2\2\2=>\b\7"+
		"\1\2>?\5\30\r\2?@\5\f\7\2@A\5\32\16\2AE\3\2\2\2BE\5\26\f\2CE\7.\2\2D="+
		"\3\2\2\2DB\3\2\2\2DC\3\2\2\2E[\3\2\2\2FG\f\f\2\2GH\7$\2\2HZ\5\f\7\rIJ"+
		"\f\13\2\2JK\7%\2\2KZ\5\f\7\fLM\f\n\2\2MN\7&\2\2NZ\5\f\7\13OP\f\t\2\2P"+
		"Q\7\'\2\2QZ\5\f\7\nRS\f\b\2\2ST\7(\2\2TZ\5\f\7\tUV\f\7\2\2VZ\7\"\2\2W"+
		"X\f\6\2\2XZ\7#\2\2YF\3\2\2\2YI\3\2\2\2YL\3\2\2\2YO\3\2\2\2YR\3\2\2\2Y"+
		"U\3\2\2\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2][\3\2\2"+
		"\2^_\7\7\2\2_\17\3\2\2\2`a\7\n\2\2a\21\3\2\2\2bc\7\6\2\2c\23\3\2\2\2d"+
		"e\7\13\2\2ef\5\f\7\2fg\7\30\2\2gk\7\16\2\2hj\5\4\3\2ih\3\2\2\2jm\3\2\2"+
		"\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\17\2\2o\25\3\2\2\2pq\7"+
		"\13\2\2qr\5\f\7\2rv\7\16\2\2su\5\f\7\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2v"+
		"w\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\17\2\2z\27\3\2\2\2{|\7\16\2\2|}\7\22"+
		"\2\2}~\7\20\2\2~\31\3\2\2\2\177\u0080\7\17\2\2\u0080\u0081\7\21\2\2\u0081"+
		"\u0082\7\23\2\2\u0082\33\3\2\2\2\t!-DY[kv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}