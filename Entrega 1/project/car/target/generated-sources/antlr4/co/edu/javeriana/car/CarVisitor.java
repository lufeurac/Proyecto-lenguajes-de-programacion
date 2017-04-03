// Generated from co\edu\javeriana\car\Car.g4 by ANTLR 4.5.1
package co.edu.javeriana.car;

  import co.edu.javeriana.car.*;
  import co.edu.javeriana.interpreter.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(CarParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#cmd_color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_color(CarParser.Cmd_colorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#cmd_mf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_mf(CarParser.Cmd_mfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#cmd_mb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_mb(CarParser.Cmd_mbContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#cmd_tr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_tr(CarParser.Cmd_trContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#cmd_tl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_tl(CarParser.Cmd_tlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CarParser.NumberContext ctx);
}