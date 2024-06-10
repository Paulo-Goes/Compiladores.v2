package CompiladorAH;// Generated from C:/Users/Paulo/IdeaProjects/Compiladores.v2/src/Expressao.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressaoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressaoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ExpressaoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar(ExpressaoParser.DeclararContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#declararVAR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararVAR(ExpressaoParser.DeclararVARContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#declararPrintln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararPrintln(ExpressaoParser.DeclararPrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExpressaoParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(ExpressaoParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExpressaoParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#declararFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararFunc(ExpressaoParser.DeclararFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(ExpressaoParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(ExpressaoParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(ExpressaoParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#coment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComent(ExpressaoParser.ComentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(ExpressaoParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#estruturaControle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturaControle(ExpressaoParser.EstruturaControleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#caseLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseLista(ExpressaoParser.CaseListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#caseDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseDecl(ExpressaoParser.CaseDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#declararEstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararEstruct(ExpressaoParser.DeclararEstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ExpressaoParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInicializacao(ExpressaoParser.ArrayInicializacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(ExpressaoParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#expreLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreLogica(ExpressaoParser.ExpreLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#expreRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreRelacional(ExpressaoParser.ExpreRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#expreAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreAritmetica(ExpressaoParser.ExpreAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#expreMulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreMulti(ExpressaoParser.ExpreMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#expreUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreUnaria(ExpressaoParser.ExpreUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#exprePostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprePostfix(ExpressaoParser.ExprePostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(ExpressaoParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressaoParser#primaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaria(ExpressaoParser.PrimariaContext ctx);
}