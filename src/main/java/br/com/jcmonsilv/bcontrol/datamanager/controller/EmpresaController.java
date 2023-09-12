package br.com.jcmonsilv.bcontrol.datamanager.controller;

import br.com.jcmonsilv.bcontrol.datamanager.domain.empresa.EmpresaDTO;
import br.com.jcmonsilv.bcontrol.datamanager.domain.empresa.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService service;
    @GetMapping
    public Page<EmpresaDTO> listarConteutoPaginado(@PageableDefault(size = 10, sort = {"nome"})Pageable page){
        return service.listaEmpresasPaginado(page);
    }
}
