package com.oncoderm.spring.services.medidaspreventivas;

import com.oncoderm.spring.domain.medidaspreventivas.MedidasPreventivas;
import com.oncoderm.spring.domain.medidaspreventivas.MedidasPreventivasDTO;
import com.oncoderm.spring.factories.MedidasPreventivasFactory;
import com.oncoderm.spring.repositories.IMedidasPreventivasRepository;
import com.oncoderm.spring.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedidasPreventivasService implements IMedidasPreventivasService {

    @Autowired
    private MedidasPreventivasFactory factory;

    @Autowired
    private IMedidasPreventivasRepository repository;

    @Override
    public MedidasPreventivas create(MedidasPreventivasDTO data) throws Exception {
        MedidasPreventivas medidas = factory.create(data);
        return this.save(medidas);
    }

    @Override
    public MedidasPreventivas save(MedidasPreventivas MedidasPreventivas) throws Exception {
        return this.repository.save(MedidasPreventivas);
    }

    @Override
    public MedidasPreventivas update(Integer id, MedidasPreventivasDTO data) throws Exception {
        MedidasPreventivas medidas = repository.findById(id).orElse(null);
        if(medidas == null) {
            return null;
        }

        Utils.copyNonNullProperties(data, medidas);
        return repository.save(medidas);
    }

    @Override
    public MedidasPreventivas getById(Integer id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("Medida de Prevenção não encontrada"));
    }

    @Override
    public List<MedidasPreventivas> getAll() throws Exception {
        return (List<MedidasPreventivas>) this.repository.findAll();
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        MedidasPreventivas medidas = repository.findById(id).orElse(null);
        if(medidas == null){
            return false;
        } else {
            repository.deleteById(id);
            return true;
        }
    }
}
