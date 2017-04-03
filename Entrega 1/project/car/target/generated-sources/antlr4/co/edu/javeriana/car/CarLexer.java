// Generated from Car.g4 by ANTLR 4.4
package co.edu.javeriana.car;

  import co.edu.javeriana.car.*;
  import co.edu.javeriana.interpreter.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CarLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'"
	};
	public static final String[] ruleNames = {
		"BK", "TR", "TL", "FW", "LET", "IF", "ELSE", "WHILE", "READ", "WRLN", 
		"FUNC", "COLOR", "PLUS", "MINUS", "MULT", "DIV", "BOP", "BCL", "PAO", 
		"PAC", "COMMA", "AND", "OR", "NOT", "GT", "LT", "EQ", "GOE", "LOE", "NEQ", 
		"ASSING", "ID", "NUMBER", "BOOLEAN", "STRING", "WS"
	};


	public CarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Car.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00fc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!"+
		"\3!\7!\u00d7\n!\f!\16!\u00da\13!\3\"\6\"\u00dd\n\"\r\"\16\"\u00de\3\""+
		"\3\"\6\"\u00e3\n\"\r\"\16\"\u00e4\7\"\u00e7\n\"\f\"\16\"\u00ea\13\"\3"+
		"#\3#\3#\3#\5#\u00f0\n#\3$\3$\3$\3$\3%\6%\u00f7\n%\r%\16%\u00f8\3%\3%\2"+
		"\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&\3\2\7\4\2C\\c|\5\2\62;C\\c|\3\2\62;\3\2$$\5\2\13\f"+
		"\17\17\"\"\u0101\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5Y\3\2\2\2\7d\3\2\2\2\tn\3\2"+
		"\2\2\13z\3\2\2\2\r~\3\2\2\2\17\u0081\3\2\2\2\21\u0086\3\2\2\2\23\u008c"+
		"\3\2\2\2\25\u0091\3\2\2\2\27\u0099\3\2\2\2\31\u00a2\3\2\2\2\33\u00a8\3"+
		"\2\2\2\35\u00aa\3\2\2\2\37\u00ac\3\2\2\2!\u00ae\3\2\2\2#\u00b0\3\2\2\2"+
		"%\u00b2\3\2\2\2\'\u00b4\3\2\2\2)\u00b6\3\2\2\2+\u00b8\3\2\2\2-\u00ba\3"+
		"\2\2\2/\u00bd\3\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2\2\65\u00c4\3\2\2"+
		"\2\67\u00c6\3\2\2\29\u00c9\3\2\2\2;\u00cc\3\2\2\2=\u00cf\3\2\2\2?\u00d2"+
		"\3\2\2\2A\u00d4\3\2\2\2C\u00dc\3\2\2\2E\u00ef\3\2\2\2G\u00f1\3\2\2\2I"+
		"\u00f6\3\2\2\2KL\7t\2\2LM\7w\2\2MN\7p\2\2NO\7a\2\2OP\7d\2\2PQ\7c\2\2Q"+
		"R\7e\2\2RS\7m\2\2ST\7y\2\2TU\7c\2\2UV\7t\2\2VW\7f\2\2WX\7u\2\2X\4\3\2"+
		"\2\2YZ\7v\2\2Z[\7w\2\2[\\\7t\2\2\\]\7p\2\2]^\7a\2\2^_\7t\2\2_`\7k\2\2"+
		"`a\7i\2\2ab\7j\2\2bc\7v\2\2c\6\3\2\2\2de\7v\2\2ef\7w\2\2fg\7t\2\2gh\7"+
		"p\2\2hi\7a\2\2ij\7n\2\2jk\7g\2\2kl\7h\2\2lm\7v\2\2m\b\3\2\2\2no\7t\2\2"+
		"op\7w\2\2pq\7p\2\2qr\7a\2\2rs\7h\2\2st\7q\2\2tu\7t\2\2uv\7y\2\2vw\7c\2"+
		"\2wx\7t\2\2xy\7f\2\2y\n\3\2\2\2z{\7n\2\2{|\7g\2\2|}\7v\2\2}\f\3\2\2\2"+
		"~\177\7k\2\2\177\u0080\7h\2\2\u0080\16\3\2\2\2\u0081\u0082\7g\2\2\u0082"+
		"\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085\20\3\2\2\2\u0086"+
		"\u0087\7y\2\2\u0087\u0088\7j\2\2\u0088\u0089\7k\2\2\u0089\u008a\7n\2\2"+
		"\u008a\u008b\7g\2\2\u008b\22\3\2\2\2\u008c\u008d\7t\2\2\u008d\u008e\7"+
		"g\2\2\u008e\u008f\7c\2\2\u008f\u0090\7f\2\2\u0090\24\3\2\2\2\u0091\u0092"+
		"\7y\2\2\u0092\u0093\7t\2\2\u0093\u0094\7k\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097\u0098\7p\2\2\u0098\26\3\2\2\2\u0099"+
		"\u009a\7h\2\2\u009a\u009b\7w\2\2\u009b\u009c\7p\2\2\u009c\u009d\7e\2\2"+
		"\u009d\u009e\7v\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5"+
		"\7n\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\32\3\2\2\2\u00a8\u00a9"+
		"\7-\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7/\2\2\u00ab\36\3\2\2\2\u00ac\u00ad"+
		"\7,\2\2\u00ad \3\2\2\2\u00ae\u00af\7\61\2\2\u00af\"\3\2\2\2\u00b0\u00b1"+
		"\7}\2\2\u00b1$\3\2\2\2\u00b2\u00b3\7\177\2\2\u00b3&\3\2\2\2\u00b4\u00b5"+
		"\7*\2\2\u00b5(\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7*\3\2\2\2\u00b8\u00b9\7"+
		".\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7(\2\2\u00bb\u00bc\7(\2\2\u00bc.\3\2"+
		"\2\2\u00bd\u00be\7~\2\2\u00be\u00bf\7~\2\2\u00bf\60\3\2\2\2\u00c0\u00c1"+
		"\7#\2\2\u00c1\62\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3\64\3\2\2\2\u00c4\u00c5"+
		"\7>\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7\u00c8\7?\2\2\u00c88"+
		"\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca\u00cb\7?\2\2\u00cb:\3\2\2\2\u00cc\u00cd"+
		"\7>\2\2\u00cd\u00ce\7?\2\2\u00ce<\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0\u00d1"+
		"\7@\2\2\u00d1>\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3@\3\2\2\2\u00d4\u00d8\t"+
		"\2\2\2\u00d5\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9B\3\2\2\2\u00da\u00d8\3\2\2\2"+
		"\u00db\u00dd\t\4\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e8\3\2\2\2\u00e0\u00e2\7\60\2\2"+
		"\u00e1\u00e3\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9D\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7%\2\2\u00ec\u00f0\7v\2\2\u00ed\u00ee"+
		"\7%\2\2\u00ee\u00f0\7h\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"F\3\2\2\2\u00f1\u00f2\7$\2\2\u00f2\u00f3\n\5\2\2\u00f3\u00f4\7$\2\2\u00f4"+
		"H\3\2\2\2\u00f5\u00f7\t\6\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2"+
		"\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\b%\2\2\u00fbJ\3\2\2\2\t\2\u00d8\u00de\u00e4\u00e8\u00ef\u00f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}