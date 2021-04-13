/**
 * Copyright © 2014 Federico Recio (N/A)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@Library(['private-pipeline-library']) _

/**
 * GitHub Pull Request builder.
 *
 * The real Jenkinsfile logic is in our shared Jenkins library:
 *   https://github.com/sonatype/pipeline-jenkins-common/
 * That library must be added to the Jenkins job as a Pipeline Library for this to work.
 *
 * We're using a style from this example, to get code reuse across scheduled-services:
 * https://jenkins.io/doc/book/pipeline/shared-libraries/#defining-a-more-structured-dsl
 */
stagingWorkflow {
  gitHubRepoPath = 'sonatype/dropwizard-swagger'
  channelToNotify = 'slack-tests'
}
