// Generated from Car.g4 by ANTLR 4.4
package co.edu.javeriana.car;

  import co.edu.javeriana.car.*;
  import co.edu.javeriana.interpreter.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BK=1, TR=2, TL=3, FW=4, LET=5, IF=6, ELSE=7, WHILE=8, READ=9, WRLN=10, 
		FUNC=11, COLOR=12, PLUS=13, MINUS=14, MULT=15, DIV=16, BOP=17, BCL=18, 
		PAO=19, PAC=20, COMMA=21, AND=22, OR=23, NOT=24, GT=25, LT=26, EQ=27, 
		GOE=28, LOE=29, NEQ=30, ASSING=31, ID=32, NUMBER=33, BOOLEAN=34, STRING=35, 
		WS=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'run_backwards'", "'turn_right'", "'turn_left'", "'run_forward'", 
		"'let'", "'if'", "'else'", "'while'", "'read'", "'writeln'", "'function'", 
		"'color'", "'+'", "'-'", "'*'", "'/'", "'{'", "'}'", "'('", "')'", "','", 
		"'&&'", "'||'", "'!'", "'>'", "'<'", "'=='", "'>='", "'<='", "'<>'", "'='", 
		"ID", "NUMBER", "BOOLEAN", "STRING", "WS"
	};
	public static final int
		RULE_start = 0, RULE_sentence = 1, RULE_cmd_color = 2, RULE_cmd_mf = 3, 
		RULE_cmd_mb = 4, RULE_cmd_tr = 5, RULE_cmd_tl = 6, RULE_number = 7;
	public static final String[] ruleNames = {
		"start", "sentence", "cmd_color", "cmd_mf", "cmd_mb", "cmd_tr", "cmd_tl", 
		"number"
	};

	@Override
	public String getGrammarFileName() { return "Car.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  private Car car;
	  public CarParser(Car car, TokenStream input) {
	    this(input);
	    this.car = car;
	  }
	 

	public CarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BK) | (1L << TR) | (1L << TL) | (1L << FW) | (1L << COLOR))) != 0)) {
				{
				{
				setState(16); sentence();
				}
				}
				setState(21);
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

	public static class SentenceContext extends ParserRuleContext {
		public Cmd_colorContext cmd_color() {
			return getRuleContext(Cmd_colorContext.class,0);
		}
		public Cmd_trContext cmd_tr() {
			return getRuleContext(Cmd_trContext.class,0);
		}
		public Cmd_mfContext cmd_mf() {
			return getRuleContext(Cmd_mfContext.class,0);
		}
		public Cmd_mbContext cmd_mb() {
			return getRuleContext(Cmd_mbContext.class,0);
		}
		public Cmd_tlContext cmd_tl() {
			return getRuleContext(Cmd_tlContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(27);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(22); cmd_color();
				}
				break;
			case FW:
				enterOuterAlt(_localctx, 2);
				{
				setState(23); cmd_mf();
				}
				break;
			case BK:
				enterOuterAlt(_localctx, 3);
				{
				setState(24); cmd_mb();
				}
				break;
			case TR:
				enterOuterAlt(_localctx, 4);
				{
				setState(25); cmd_tr();
				}
				break;
			case TL:
				enterOuterAlt(_localctx, 5);
				{
				setState(26); cmd_tl();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Cmd_colorContext extends ParserRuleContext {
		public NumberContext r;
		public NumberContext g;
		public NumberContext b;
		public NumberContext a;
		public TerminalNode COLOR() { return getToken(CarParser.COLOR, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CarParser.COMMA); }
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CarParser.COMMA, i);
		}
		public Cmd_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterCmd_color(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitCmd_color(this);
		}
	}

	public final Cmd_colorContext cmd_color() throws RecognitionException {
		Cmd_colorContext _localctx = new Cmd_colorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(COLOR);
			setState(30); ((Cmd_colorContext)_localctx).r = number();
			setState(31); match(COMMA);
			setState(32); ((Cmd_colorContext)_localctx).g = number();
			setState(33); match(COMMA);
			setState(34); ((Cmd_colorContext)_localctx).b = number();
			setState(35); match(COMMA);
			setState(36); ((Cmd_colorContext)_localctx).a = number();

					System.out.println("El carro usa el color " + (((Cmd_colorContext)_localctx).r!=null?_input.getText(((Cmd_colorContext)_localctx).r.start,((Cmd_colorContext)_localctx).r.stop):null) + "," + (((Cmd_colorContext)_localctx).g!=null?_input.getText(((Cmd_colorContext)_localctx).g.start,((Cmd_colorContext)_localctx).g.stop):null) + "," + (((Cmd_colorContext)_localctx).b!=null?_input.getText(((Cmd_colorContext)_localctx).b.start,((Cmd_colorContext)_localctx).b.stop):null) + "," + (((Cmd_colorContext)_localctx).a!=null?_input.getText(((Cmd_colorContext)_localctx).a.start,((Cmd_colorContext)_localctx).a.stop):null));
					car.color(((Cmd_colorContext)_localctx).r.value,((Cmd_colorContext)_localctx).g.value,((Cmd_colorContext)_localctx).b.value,((Cmd_colorContext)_localctx).a.value);
				
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

	public static class Cmd_mfContext extends ParserRuleContext {
		public NumberContext n;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode FW() { return getToken(CarParser.FW, 0); }
		public Cmd_mfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_mf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterCmd_mf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitCmd_mf(this);
		}
	}

	public final Cmd_mfContext cmd_mf() throws RecognitionException {
		Cmd_mfContext _localctx = new Cmd_mfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd_mf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(FW);
			setState(40); ((Cmd_mfContext)_localctx).n = number();

					System.out.println("El carro avanza "+ ((Cmd_mfContext)_localctx).n.value + " unidades");
					car.forward(((Cmd_mfContext)_localctx).n.value);
				
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

	public static class Cmd_mbContext extends ParserRuleContext {
		public NumberContext n;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode BK() { return getToken(CarParser.BK, 0); }
		public Cmd_mbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_mb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterCmd_mb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitCmd_mb(this);
		}
	}

	public final Cmd_mbContext cmd_mb() throws RecognitionException {
		Cmd_mbContext _localctx = new Cmd_mbContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd_mb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(BK);
			setState(44); ((Cmd_mbContext)_localctx).n = number();

					System.out.println("El carro retrocede "+ ((Cmd_mbContext)_localctx).n.value + " unidades");
					car.back(((Cmd_mbContext)_localctx).n.value);
				
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

	public static class Cmd_trContext extends ParserRuleContext {
		public NumberContext n;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode TR() { return getToken(CarParser.TR, 0); }
		public Cmd_trContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_tr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterCmd_tr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitCmd_tr(this);
		}
	}

	public final Cmd_trContext cmd_tr() throws RecognitionException {
		Cmd_trContext _localctx = new Cmd_trContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd_tr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(TR);
			setState(48); ((Cmd_trContext)_localctx).n = number();

					System.out.println("El carro gira " + ((Cmd_trContext)_localctx).n.value + " unidades a la derecha");
					car.right(((Cmd_trContext)_localctx).n.value);
				
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

	public static class Cmd_tlContext extends ParserRuleContext {
		public NumberContext n;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode TL() { return getToken(CarParser.TL, 0); }
		public Cmd_tlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_tl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterCmd_tl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitCmd_tl(this);
		}
	}

	public final Cmd_tlContext cmd_tl() throws RecognitionException {
		Cmd_tlContext _localctx = new Cmd_tlContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd_tl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(TL);
			setState(52); ((Cmd_tlContext)_localctx).n = number();

					System.out.println("El carro gira " + ((Cmd_tlContext)_localctx).n.value + " unidades a la izquierda");
					car.left(((Cmd_tlContext)_localctx).n.value);
				
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

	public static class NumberContext extends ParserRuleContext {
		public float value;
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(CarParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); ((NumberContext)_localctx).NUMBER = match(NUMBER);
			((NumberContext)_localctx).value =  Float.parseFloat((((NumberContext)_localctx).NUMBER!=null?((NumberContext)_localctx).NUMBER.getText():null));
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&=\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2\16"+
		"\2\27\13\2\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\29\2\25\3\2\2\2\4\35"+
		"\3\2\2\2\6\37\3\2\2\2\b)\3\2\2\2\n-\3\2\2\2\f\61\3\2\2\2\16\65\3\2\2\2"+
		"\209\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25"+
		"\26\3\2\2\2\26\3\3\2\2\2\27\25\3\2\2\2\30\36\5\6\4\2\31\36\5\b\5\2\32"+
		"\36\5\n\6\2\33\36\5\f\7\2\34\36\5\16\b\2\35\30\3\2\2\2\35\31\3\2\2\2\35"+
		"\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37 \7\16\2\2 !\5"+
		"\20\t\2!\"\7\27\2\2\"#\5\20\t\2#$\7\27\2\2$%\5\20\t\2%&\7\27\2\2&\'\5"+
		"\20\t\2\'(\b\4\1\2(\7\3\2\2\2)*\7\6\2\2*+\5\20\t\2+,\b\5\1\2,\t\3\2\2"+
		"\2-.\7\3\2\2./\5\20\t\2/\60\b\6\1\2\60\13\3\2\2\2\61\62\7\4\2\2\62\63"+
		"\5\20\t\2\63\64\b\7\1\2\64\r\3\2\2\2\65\66\7\5\2\2\66\67\5\20\t\2\678"+
		"\b\b\1\28\17\3\2\2\29:\7#\2\2:;\b\t\1\2;\21\3\2\2\2\4\25\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}