package br.com.jcmonsilv.bcontrol.datamanager.domain.empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    public void cadastrarNovaEmpresa(EmpresaDTO dto){
        Empresa empresa = dto.toEmpresa();
        repository.save(empresa);
    }

    public Page<EmpresaDTO> listaEmpresasPaginado(Pageable page){
        return repository.findAll(page).map(EmpresaDTO::fromEmpresa);
    }
}
