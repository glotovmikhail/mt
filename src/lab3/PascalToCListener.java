// Generated from PascalToC.g4 by ANTLR 4.5.3

package lab3;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalToCParser}.
 */
public interface PascalToCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#wholeProgram}.
	 * @param ctx the parse tree
	 */
	void enterWholeProgram(PascalToCParser.WholeProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#wholeProgram}.
	 * @param ctx the parse tree
	 */
	void exitWholeProgram(PascalToCParser.WholeProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#programId}.
	 * @param ctx the parse tree
	 */
	void enterProgramId(PascalToCParser.ProgramIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#programId}.
	 * @param ctx the parse tree
	 */
	void exitProgramId(PascalToCParser.ProgramIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(PascalToCParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(PascalToCParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascalToCParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascalToCParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#varNames}.
	 * @param ctx the parse tree
	 */
	void enterVarNames(PascalToCParser.VarNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#varNames}.
	 * @param ctx the parse tree
	 */
	void exitVarNames(PascalToCParser.VarNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(PascalToCParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(PascalToCParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(PascalToCParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(PascalToCParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#programName}.
	 * @param ctx the parse tree
	 */
	void enterProgramName(PascalToCParser.ProgramNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#programName}.
	 * @param ctx the parse tree
	 */
	void exitProgramName(PascalToCParser.ProgramNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#programBody}.
	 * @param ctx the parse tree
	 */
	void enterProgramBody(PascalToCParser.ProgramBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#programBody}.
	 * @param ctx the parse tree
	 */
	void exitProgramBody(PascalToCParser.ProgramBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PascalToCParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PascalToCParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascalToCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascalToCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(PascalToCParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(PascalToCParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(PascalToCParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(PascalToCParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(PascalToCParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(PascalToCParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(PascalToCParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(PascalToCParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PascalToCParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PascalToCParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascalToCParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascalToCParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PascalToCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PascalToCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PascalToCParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PascalToCParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascalToCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascalToCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(PascalToCParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(PascalToCParser.CmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PascalToCParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PascalToCParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascalToCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascalToCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(PascalToCParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(PascalToCParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(PascalToCParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(PascalToCParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascalToCParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascalToCParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#unsignedConst}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConst(PascalToCParser.UnsignedConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#unsignedConst}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConst(PascalToCParser.UnsignedConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(PascalToCParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(PascalToCParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalToCParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PascalToCParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalToCParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PascalToCParser.StringContext ctx);
}