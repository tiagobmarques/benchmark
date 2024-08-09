package com.mavem.application.contasapagar;

import com.mavem.application.contasapagar.ContasAPagarResponse.ContasAPagarResponseBuilder;
import com.mavem.domain.contasapagar.ContasAPagarEntity;
import com.mavem.domain.contasapagar.ContasAPagarEntity.ContasAPagarEntityBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-08T14:22:19-0300",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.2.jar, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class ContasAPagarMapperImpl implements ContasAPagarMapper {

    @Override
    public ContasAPagarResponse toResponse(ContasAPagarEntity contasAPagarEntity) {
        if ( contasAPagarEntity == null ) {
            return null;
        }

        ContasAPagarResponseBuilder contasAPagarResponse = ContasAPagarResponse.builder();

        contasAPagarResponse.id( contasAPagarEntity.getId() );
        contasAPagarResponse.dataVencimento( contasAPagarEntity.getDataVencimento() );
        contasAPagarResponse.dataPagamento( contasAPagarEntity.getDataPagamento() );
        contasAPagarResponse.valor( contasAPagarEntity.getValor() );
        contasAPagarResponse.descricao( contasAPagarEntity.getDescricao() );
        contasAPagarResponse.situacao( contasAPagarEntity.getSituacao() );

        return contasAPagarResponse.build();
    }

    @Override
    public ContasAPagarEntity toEntity(ContasAPagarRequest contasAPagarRequest) {
        if ( contasAPagarRequest == null ) {
            return null;
        }

        ContasAPagarEntityBuilder contasAPagarEntity = ContasAPagarEntity.builder();

        contasAPagarEntity.dataVencimento( contasAPagarRequest.getDataVencimento() );
        contasAPagarEntity.dataPagamento( contasAPagarRequest.getDataPagamento() );
        contasAPagarEntity.valor( contasAPagarRequest.getValor() );
        contasAPagarEntity.descricao( contasAPagarRequest.getDescricao() );
        contasAPagarEntity.situacao( contasAPagarRequest.getSituacao() );

        return contasAPagarEntity.build();
    }

    @Override
    public ContasAPagarEntity toEntity(ContasAPagarEntity contasAPagarEntity, ContasAPagarRequest contasAPagarRequest) {
        if ( contasAPagarEntity == null && contasAPagarRequest == null ) {
            return null;
        }

        ContasAPagarEntityBuilder contasAPagarEntity1 = ContasAPagarEntity.builder();

        if ( contasAPagarEntity != null ) {
            contasAPagarEntity1.id( contasAPagarEntity.getId() );
        }
        if ( contasAPagarRequest != null ) {
            contasAPagarEntity1.dataVencimento( contasAPagarRequest.getDataVencimento() );
            contasAPagarEntity1.dataPagamento( contasAPagarRequest.getDataPagamento() );
            contasAPagarEntity1.valor( contasAPagarRequest.getValor() );
            contasAPagarEntity1.descricao( contasAPagarRequest.getDescricao() );
            contasAPagarEntity1.situacao( contasAPagarRequest.getSituacao() );
        }

        return contasAPagarEntity1.build();
    }

    @Override
    public ContasAPagarEntity toEntitySituacao(ContasAPagarEntity contasAPagarEntity, ContasAPagarRequest contasAPagarRequest) {
        if ( contasAPagarEntity == null && contasAPagarRequest == null ) {
            return null;
        }

        ContasAPagarEntityBuilder contasAPagarEntity1 = ContasAPagarEntity.builder();

        if ( contasAPagarEntity != null ) {
            contasAPagarEntity1.id( contasAPagarEntity.getId() );
            contasAPagarEntity1.dataVencimento( contasAPagarEntity.getDataVencimento() );
            contasAPagarEntity1.dataPagamento( contasAPagarEntity.getDataPagamento() );
            contasAPagarEntity1.valor( contasAPagarEntity.getValor() );
            contasAPagarEntity1.descricao( contasAPagarEntity.getDescricao() );
        }
        if ( contasAPagarRequest != null ) {
            contasAPagarEntity1.situacao( contasAPagarRequest.getSituacao() );
        }

        return contasAPagarEntity1.build();
    }
}
