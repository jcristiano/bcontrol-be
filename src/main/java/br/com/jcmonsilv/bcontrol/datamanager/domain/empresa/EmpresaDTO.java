package br.com.jcmonsilv.bcontrol.datamanager.domain.empresa;

public record EmpresaDTO(String nome, String descricao) {
    public Empresa toEmpresa() {
        return Empresa.builder()
                .nome(this.nome)
                .descricao(this.descricao)
                .build();
    }

    public static EmpresaDTO fromEmpresa(Empresa empresa){
        return new EmpresaDTO(empresa.getNome(), empresa.getDescricao());
    }
}
