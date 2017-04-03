// Generated from Car.g4 by ANTLR 4.4
package co.edu.javeriana.car;

  import co.edu.javeriana.car.*;
  import co.edu.javeriana.interpreter.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CarParser}.
 */
public interface CarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull CarParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull CarParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#cmd_mf}.
	 * @param ctx the parse tree
	 */
	void enterCmd_mf(@NotNull CarParser.Cmd_mfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#cmd_mf}.
	 * @param ctx the parse tree
	 */
	void exitCmd_mf(@NotNull CarParser.Cmd_mfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull CarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull CarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#cmd_tl}.
	 * @param ctx the parse tree
	 */
	void enterCmd_tl(@NotNull CarParser.Cmd_tlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#cmd_tl}.
	 * @param ctx the parse tree
	 */
	void exitCmd_tl(@NotNull CarParser.Cmd_tlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#cmd_mb}.
	 * @param ctx the parse tree
	 */
	void enterCmd_mb(@NotNull CarParser.Cmd_mbContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#cmd_mb}.
	 * @param ctx the parse tree
	 */
	void exitCmd_mb(@NotNull CarParser.Cmd_mbContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#cmd_color}.
	 * @param ctx the parse tree
	 */
	void enterCmd_color(@NotNull CarParser.Cmd_colorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#cmd_color}.
	 * @param ctx the parse tree
	 */
	void exitCmd_color(@NotNull CarParser.Cmd_colorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull CarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull CarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#cmd_tr}.
	 * @param ctx the parse tree
	 */
	void enterCmd_tr(@NotNull CarParser.Cmd_trContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#cmd_tr}.
	 * @param ctx the parse tree
	 */
	void exitCmd_tr(@NotNull CarParser.Cmd_trContext ctx);
}