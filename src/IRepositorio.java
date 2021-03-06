public interface IRepositorio {

    void adicionaPropostaRequisicao(PropostaAquisicao proposta);
    void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);
    void adicionaEncomenda(Encomenda encomenda);
    void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);
    void adicionaUtilizador(Utilizador utilizador);
    void adicionaTipoUtilizador(TipoUtilizador tipo);
    void adicionaRequisicao(Requisicao requisicao);
    void adicionaCopia(Copia copia);
    void adicionaLivro(Livro livro);
    void adicionaEmprestimo(Emprestimo emprestimo);
    void adicionaNotificacao(Notificacao notificacao);
    void adicionaDevolucao(Devolucao devolucao);
    void adicionaCoima(Coima coima);
    Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);
}
