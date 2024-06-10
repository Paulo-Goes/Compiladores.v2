package CompiladorAH;// Generated from C:/Users/Paulo/IdeaProjects/Compiladores.v2/src/Expressao.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressaoParser}.
 */
public interface ExpressaoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ExpressaoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ExpressaoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#declarar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar(ExpressaoParser.DeclararContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#declarar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar(ExpressaoParser.DeclararContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#declararVAR}.
	 * @param ctx the parse tree
	 */
	void enterDeclararVAR(ExpressaoParser.DeclararVARContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#declararVAR}.
	 * @param ctx the parse tree
	 */
	void exitDeclararVAR(ExpressaoParser.DeclararVARContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#declararPrintln}.
	 * @param ctx the parse tree
	 */
	void enterDeclararPrintln(ExpressaoParser.DeclararPrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#declararPrintln}.
	 * @param ctx the parse tree
	 */
	void exitDeclararPrintln(ExpressaoParser.DeclararPrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExpressaoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExpressaoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(ExpressaoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(ExpressaoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExpressaoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExpressaoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#declararFunc}.
	 * @param ctx the parse tree
	 */
	void enterDeclararFunc(ExpressaoParser.DeclararFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#declararFunc}.
	 * @param ctx the parse tree
	 */
	void exitDeclararFunc(ExpressaoParser.DeclararFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(ExpressaoParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(ExpressaoParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(ExpressaoParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(ExpressaoParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(ExpressaoParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(ExpressaoParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#coment}.
	 * @param ctx the parse tree
	 */
	void enterComent(ExpressaoParser.ComentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#coment}.
	 * @param ctx the parse tree
	 */
	void exitComent(ExpressaoParser.ComentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(ExpressaoParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(ExpressaoParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void enterEstruturaControle(ExpressaoParser.EstruturaControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void exitEstruturaControle(ExpressaoParser.EstruturaControleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void enterCaseLista(ExpressaoParser.CaseListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void exitCaseLista(ExpressaoParser.CaseListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void enterCaseDecl(ExpressaoParser.CaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void exitCaseDecl(ExpressaoParser.CaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#declararEstruct}.
	 * @param ctx the parse tree
	 */
	void enterDeclararEstruct(ExpressaoParser.DeclararEstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#declararEstruct}.
	 * @param ctx the parse tree
	 */
	void exitDeclararEstruct(ExpressaoParser.DeclararEstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ExpressaoParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ExpressaoParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 */
	void enterArrayInicializacao(ExpressaoParser.ArrayInicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 */
	void exitArrayInicializacao(ExpressaoParser.ArrayInicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(ExpressaoParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(ExpressaoParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#expreLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpreLogica(ExpressaoParser.ExpreLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#expreLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpreLogica(ExpressaoParser.ExpreLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#expreRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpreRelacional(ExpressaoParser.ExpreRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#expreRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpreRelacional(ExpressaoParser.ExpreRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#expreAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpreAritmetica(ExpressaoParser.ExpreAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#expreAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpreAritmetica(ExpressaoParser.ExpreAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#expreMulti}.
	 * @param ctx the parse tree
	 */
	void enterExpreMulti(ExpressaoParser.ExpreMultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#expreMulti}.
	 * @param ctx the parse tree
	 */
	void exitExpreMulti(ExpressaoParser.ExpreMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#expreUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpreUnaria(ExpressaoParser.ExpreUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#expreUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpreUnaria(ExpressaoParser.ExpreUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#exprePostfix}.
	 * @param ctx the parse tree
	 */
	void enterExprePostfix(ExpressaoParser.ExprePostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#exprePostfix}.
	 * @param ctx the parse tree
	 */
	void exitExprePostfix(ExpressaoParser.ExprePostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(ExpressaoParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(ExpressaoParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressaoParser#primaria}.
	 * @param ctx the parse tree
	 */
	void enterPrimaria(ExpressaoParser.PrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressaoParser#primaria}.
	 * @param ctx the parse tree
	 */
	void exitPrimaria(ExpressaoParser.PrimariaContext ctx);
}