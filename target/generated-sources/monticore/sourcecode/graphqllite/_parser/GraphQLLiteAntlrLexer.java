// Generated from /Users/esentri/bitbucket/dsl-demo/digraph/target/generated-sources/monticore/sourcecode/graphqllite/_parser/GraphQLLiteAntlrLexer.g4 by ANTLR 4.7.1

  package graphqllite._parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphQLLiteAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCHEMA3386979745=1, EXCLAMATIONMARK=2, FALSE97196323=3, STRING2486848561=4, 
		TYPE3575610=5, MINUS=6, POINT=7, INT73679=8, FLOAT67973692=9, SCALAR3386777580=10, 
		NULL3392903=11, TRUE3569038=12, COLON=13, LCURLY=14, LBRACK=15, ID2331=16, 
		BOOLEAN1729365000=17, RCURLY=18, RBRACK=19, Digits=20, String=21, Name=22, 
		Char=23, ML_COMMENT=24, SL_COMMENT=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SCHEMA3386979745", "EXCLAMATIONMARK", "FALSE97196323", "STRING2486848561", 
		"TYPE3575610", "MINUS", "POINT", "INT73679", "FLOAT67973692", "SCALAR3386777580", 
		"NULL3392903", "TRUE3569038", "COLON", "LCURLY", "LBRACK", "ID2331", "BOOLEAN1729365000", 
		"RCURLY", "RBRACK", "Digit", "OctalDigit", "StringCharacters", "SingleCharacter", 
		"NEWLINE", "Digits", "EscapeSequence", "String", "HexDigit", "StringCharacter", 
		"Name", "Char", "ML_COMMENT", "SL_COMMENT", "ZeroToThree", "OctalEscape", 
		"UnicodeEscape", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'schema'", "'!'", "'false'", "'String'", "'type'", "'-'", "'.'", 
		"'Int'", "'Float'", "'scalar'", "'null'", "'true'", "':'", "'{'", "'['", 
		"'ID'", "'Boolean'", "'}'", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCHEMA3386979745", "EXCLAMATIONMARK", "FALSE97196323", "STRING2486848561", 
		"TYPE3575610", "MINUS", "POINT", "INT73679", "FLOAT67973692", "SCALAR3386777580", 
		"NULL3392903", "TRUE3569038", "COLON", "LCURLY", "LBRACK", "ID2331", "BOOLEAN1729365000", 
		"RCURLY", "RBRACK", "Digits", "String", "Name", "Char", "ML_COMMENT", 
		"SL_COMMENT", "WS"
	};
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





	private GraphQLLiteAntlrParser _monticore_parser;

	protected GraphQLLiteAntlrParser getCompiler() {
	   return _monticore_parser;
	}

	public void setMCParser(GraphQLLiteAntlrParser in) {
	  this._monticore_parser = in;
	}

	protected void storeComment(){
	  if (getCompiler() != null) {
	    de.monticore.ast.Comment _comment = new de.monticore.ast.Comment(getText());
	    de.se_rwth.commons.SourcePosition startPos = new de.se_rwth.commons.SourcePosition(_tokenStartLine, _tokenStartCharPositionInLine);
	    _comment.set_SourcePositionStart(startPos);
	    _comment.set_SourcePositionEnd(getCompiler().computeEndPosition(startPos, getText()));
	    getCompiler().addComment(_comment);
	  }
	}


	public GraphQLLiteAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraphQLLiteAntlrLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26:
			String_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			Char_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			ML_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void String_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1,getText().length() - 1));


			break;
		}
	}
	private void Char_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			setText(getText().substring(1,getText().length() - 1));


			break;
		}
	}
	private void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			storeComment();


			break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			storeComment();


			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u010a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6\27\u00a2"+
		"\n\27\r\27\16\27\u00a3\3\30\3\30\3\31\3\31\3\31\5\31\u00ab\n\31\3\32\6"+
		"\32\u00ae\n\32\r\32\16\32\u00af\3\33\3\33\3\33\3\33\5\33\u00b6\n\33\3"+
		"\34\3\34\5\34\u00ba\n\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\5\36\u00c3"+
		"\n\36\3\37\3\37\7\37\u00c7\n\37\f\37\16\37\u00ca\13\37\3 \3 \3 \5 \u00cf"+
		"\n \3 \3 \3 \3!\3!\3!\3!\7!\u00d8\n!\f!\16!\u00db\13!\3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\7\"\u00e8\n\"\f\"\16\"\u00eb\13\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00fe\n$\3%\3%\3%\3%\3%\3%"+
		"\3%\3&\3&\3&\3&\3\u00d9\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63\26"+
		"\65\2\67\279\2;\2=\30?\31A\32C\33E\2G\2I\2K\34\3\2\n\3\2))\4\2\f\f\17"+
		"\17\n\2$$))^^ddhhppttvv\5\2\62;CHch\4\2$$^^\6\2&&C\\aac|\7\2&&\62;C\\"+
		"aac|\5\2\13\f\17\17\"\"\2\u010b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2\63\3\2\2"+
		"\2\2\67\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2K\3\2\2\2"+
		"\3M\3\2\2\2\5T\3\2\2\2\7V\3\2\2\2\t\\\3\2\2\2\13c\3\2\2\2\rh\3\2\2\2\17"+
		"j\3\2\2\2\21l\3\2\2\2\23p\3\2\2\2\25v\3\2\2\2\27}\3\2\2\2\31\u0082\3\2"+
		"\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008d\3\2\2\2"+
		"#\u0090\3\2\2\2%\u0098\3\2\2\2\'\u009a\3\2\2\2)\u009c\3\2\2\2+\u009e\3"+
		"\2\2\2-\u00a1\3\2\2\2/\u00a5\3\2\2\2\61\u00aa\3\2\2\2\63\u00ad\3\2\2\2"+
		"\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00be\3\2\2\2;\u00c2\3\2\2\2=\u00c4"+
		"\3\2\2\2?\u00cb\3\2\2\2A\u00d3\3\2\2\2C\u00e3\3\2\2\2E\u00f0\3\2\2\2G"+
		"\u00fd\3\2\2\2I\u00ff\3\2\2\2K\u0106\3\2\2\2MN\7u\2\2NO\7e\2\2OP\7j\2"+
		"\2PQ\7g\2\2QR\7o\2\2RS\7c\2\2S\4\3\2\2\2TU\7#\2\2U\6\3\2\2\2VW\7h\2\2"+
		"WX\7c\2\2XY\7n\2\2YZ\7u\2\2Z[\7g\2\2[\b\3\2\2\2\\]\7U\2\2]^\7v\2\2^_\7"+
		"t\2\2_`\7k\2\2`a\7p\2\2ab\7i\2\2b\n\3\2\2\2cd\7v\2\2de\7{\2\2ef\7r\2\2"+
		"fg\7g\2\2g\f\3\2\2\2hi\7/\2\2i\16\3\2\2\2jk\7\60\2\2k\20\3\2\2\2lm\7K"+
		"\2\2mn\7p\2\2no\7v\2\2o\22\3\2\2\2pq\7H\2\2qr\7n\2\2rs\7q\2\2st\7c\2\2"+
		"tu\7v\2\2u\24\3\2\2\2vw\7u\2\2wx\7e\2\2xy\7c\2\2yz\7n\2\2z{\7c\2\2{|\7"+
		"t\2\2|\26\3\2\2\2}~\7p\2\2~\177\7w\2\2\177\u0080\7n\2\2\u0080\u0081\7"+
		"n\2\2\u0081\30\3\2\2\2\u0082\u0083\7v\2\2\u0083\u0084\7t\2\2\u0084\u0085"+
		"\7w\2\2\u0085\u0086\7g\2\2\u0086\32\3\2\2\2\u0087\u0088\7<\2\2\u0088\34"+
		"\3\2\2\2\u0089\u008a\7}\2\2\u008a\36\3\2\2\2\u008b\u008c\7]\2\2\u008c"+
		" \3\2\2\2\u008d\u008e\7K\2\2\u008e\u008f\7F\2\2\u008f\"\3\2\2\2\u0090"+
		"\u0091\7D\2\2\u0091\u0092\7q\2\2\u0092\u0093\7q\2\2\u0093\u0094\7n\2\2"+
		"\u0094\u0095\7g\2\2\u0095\u0096\7c\2\2\u0096\u0097\7p\2\2\u0097$\3\2\2"+
		"\2\u0098\u0099\7\177\2\2\u0099&\3\2\2\2\u009a\u009b\7_\2\2\u009b(\3\2"+
		"\2\2\u009c\u009d\4\62;\2\u009d*\3\2\2\2\u009e\u009f\4\629\2\u009f,\3\2"+
		"\2\2\u00a0\u00a2\5;\36\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4.\3\2\2\2\u00a5\u00a6\n\2\2\2"+
		"\u00a6\60\3\2\2\2\u00a7\u00a8\7\17\2\2\u00a8\u00ab\7\f\2\2\u00a9\u00ab"+
		"\t\3\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\62\3\2\2\2\u00ac"+
		"\u00ae\5)\25\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7^\2\2\u00b2\u00b6"+
		"\t\4\2\2\u00b3\u00b6\5G$\2\u00b4\u00b6\5I%\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\66\3\2\2\2\u00b7\u00b9\7$\2\2"+
		"\u00b8\u00ba\5-\27\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc\u00bd\b\34\2\2\u00bd8\3\2\2\2\u00be"+
		"\u00bf\t\5\2\2\u00bf:\3\2\2\2\u00c0\u00c3\n\6\2\2\u00c1\u00c3\5\65\33"+
		"\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3<\3\2\2\2\u00c4\u00c8"+
		"\t\7\2\2\u00c5\u00c7\t\b\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9>\3\2\2\2\u00ca\u00c8\3\2\2\2"+
		"\u00cb\u00ce\7)\2\2\u00cc\u00cf\5/\30\2\u00cd\u00cf\5\65\33\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7)\2\2\u00d1"+
		"\u00d2\b \3\2\u00d2@\3\2\2\2\u00d3\u00d4\7\61\2\2\u00d4\u00d5\7,\2\2\u00d5"+
		"\u00d9\3\2\2\2\u00d6\u00d8\13\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd\u00de\7\61\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e0\b!\4\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b!\5\2\u00e2B"+
		"\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00e9\3\2\2\2"+
		"\u00e6\u00e8\n\3\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ed\b\"\6\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\"\5\2\u00efD\3\2\2\2"+
		"\u00f0\u00f1\4\62\65\2\u00f1F\3\2\2\2\u00f2\u00f3\7^\2\2\u00f3\u00fe\5"+
		"+\26\2\u00f4\u00f5\7^\2\2\u00f5\u00f6\5+\26\2\u00f6\u00f7\5+\26\2\u00f7"+
		"\u00fe\3\2\2\2\u00f8\u00f9\7^\2\2\u00f9\u00fa\5E#\2\u00fa\u00fb\5+\26"+
		"\2\u00fb\u00fc\5+\26\2\u00fc\u00fe\3\2\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f4"+
		"\3\2\2\2\u00fd\u00f8\3\2\2\2\u00feH\3\2\2\2\u00ff\u0100\7^\2\2\u0100\u0101"+
		"\7w\2\2\u0101\u0102\59\35\2\u0102\u0103\59\35\2\u0103\u0104\59\35\2\u0104"+
		"\u0105\59\35\2\u0105J\3\2\2\2\u0106\u0107\t\t\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u0109\b&\5\2\u0109L\3\2\2\2\16\2\u00a3\u00aa\u00af\u00b5\u00b9"+
		"\u00c2\u00c8\u00ce\u00d9\u00e9\u00fd\7\3\34\2\3 \3\3!\4\b\2\2\3\"\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}