package com.cegedim.docMngSys.repository;

import com.cegedim.docMngSys.model.File;
import org.springframework.data.repository.CrudRepository;

public interface FileRepository extends CrudRepository<File, Long> {
}
