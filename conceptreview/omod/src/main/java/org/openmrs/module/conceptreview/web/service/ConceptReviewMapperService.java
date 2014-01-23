package org.openmrs.module.conceptreview.web.service;

import org.dozer.Mapper;
import org.openmrs.module.conceptpropose.web.dto.ProposedConceptReviewPackageDto;
import org.openmrs.module.conceptpropose.web.dto.SubmissionDto;
import org.openmrs.module.conceptreview.ProposedConceptReviewPackage;
import org.springframework.beans.factory.annotation.Autowired;

public class ConceptReviewMapperService {

	private Mapper dozerBeanMapper;

	@Autowired
	public ConceptReviewMapperService(Mapper dozerBeanMapper) {
		this.dozerBeanMapper = dozerBeanMapper;
	}

	public ProposedConceptReviewPackage convertSubmissionDtoToProposedConceptReviewPackage(final SubmissionDto incomingProposal){
		return dozerBeanMapper.map(incomingProposal, ProposedConceptReviewPackage.class);
	}

	public ProposedConceptReviewPackageDto convertProposedConceptReviewPackageToProposedConceptReviewDto(ProposedConceptReviewPackage proposedConceptPackage){
		return dozerBeanMapper.map(proposedConceptPackage, ProposedConceptReviewPackageDto.class);
	}

	public ProposedConceptReviewPackage convertProposedConceptReviewDtoToProposedConceptReviewPackage(ProposedConceptReviewPackageDto dto) {
		return dozerBeanMapper.map(dto, ProposedConceptReviewPackage.class);
	}

}
